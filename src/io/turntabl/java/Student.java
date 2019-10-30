package io.turntabl.java;

import java.util.List;

public class Student {
    private List<Double> studentGrades;

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Double> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }


    public Double getAverageGrade() {
        Double total = 0.0;
        for (Double grade: getStudentGrades()) {
            total = total+grade;
        }
        Double average = total / getStudentGrades().size();
        return  average;
    }
}
