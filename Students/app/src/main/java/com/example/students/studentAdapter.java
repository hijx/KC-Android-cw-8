package com.example.students;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class studentAdapter extends ArrayAdapter {
    List<Student>studentsList;
    public studentAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        studentsList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row,parent,false);

        Student currentStudent = studentsList .get(position);

        TextView studentNameTextView = view.findViewById(R.id.studentNameTxt);
        TextView studentAgeTextView = view.findViewById(R.id.studentAgeTxt);
        TextView studentGradeTextView = view.findViewById(R.id.studentGradeTxt);
        ImageView studentImageView = view.findViewById(R.id.studentImage);

        studentNameTextView.setText(currentStudent.getStudentName());
        studentAgeTextView.setText(String.valueOf(currentStudent.getStudentAge()) );
        studentGradeTextView.setText(String.valueOf(currentStudent.getStudentGrade()));
        studentImageView.setImageResource(currentStudent.getStudentImg());

        ImageView delteButton = view.findViewById(R.id.imageView3);
        delteButton.setOnClickListener(new View.OnClickListener() {
            Student removeStudent = studentsList.get(position);
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("Are u sure u wanna delete")
                        .setTitle("confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                studentsList.remove(removeStudent);
                                notifyDataSetChanged();
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.show();

            }
        });




        return view;

    }
}
