package io.turntabl.java;

import java.util.List;

public class Student implements Nameable,HasLevel  {
    List<Double> studentGrades;
    String name;
    private Level studentLevel;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public Level getLevel() {
        return studentLevel;
    }

    public Student(List<Double> studentGrades, String name, Level studentLevel) {
        this.studentGrades = studentGrades;
        this.name = name;
        this.studentLevel = studentLevel;
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
