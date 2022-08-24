package com.example.students;


import java.io.Serializable;

public class Student implements Serializable {

        private String studentName;
        private int studentAge;
        private int studentGrade;
        private int studentImg;

        public Student(String studentName, int studentAge, int studentGrade, int studentImg) {

            this.studentName = studentName;
            this.studentAge = studentAge;
            this.studentGrade = studentGrade;
            this.studentImg = studentImg;

        }

        public String getStudentName() { return studentName; }

        public void setStudentName(String studentName) { this.studentName = studentName; }

        public int getStudentAge() { return studentAge; }

        public void setStudentAge(int studentAge) { this.studentAge = studentAge; }

        public int getStudentGrade() { return studentGrade; }

        public void setStudentGrade(int studentGrade) { this.studentGrade = studentGrade; }

        public int getStudentImg() { return studentImg; }

        public void setStudentImg(int studentImg) { this.studentImg = studentImg; }

    }
