package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        Student thisStudent = (Student) bundle.getSerializable("Student");

        TextView studentNameTextView = findViewById(R.id.textView2);
        ImageView studentImageView = findViewById(R.id.imageView2);

        studentNameTextView.setText(thisStudent.getStudentName());
        studentImageView.setImageResource(thisStudent.getStudentImg());



    }
}