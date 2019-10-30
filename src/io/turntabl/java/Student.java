package io.turntabl.java;

import java.util.List;

public class Student {
    List<Double> studentGrades;

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Double getAverageGrade() {
        Double total = 0.0;
        for (Double grade: studentGrades) {
            total = total+grade;
        }
        Double average = total / studentGrades.size();
        return  average;
    }
}
