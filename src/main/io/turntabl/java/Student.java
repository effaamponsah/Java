package io.turntabl.java;

import java.util.*;
import java.util.stream.DoubleStream;

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

    public DoubleStream getGrade(){
//        studentGrades.stream().mapToDouble(str -> str.doubleValue()).forEach(System.out::println);
//        DoubleStream.of(3.0,4.0).forEach(System.out::println);
//        DoubleStream d = DoubleStream.of(3.0,4.0);
//        List<Double> r = d.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        return studentGrades.stream().mapToDouble(str -> str.doubleValue());
    }

    public Double highestGrade(){
//        Double high = 0.0;
//        for (Double d : studentGrades){
//            if (high > d){
//                high = d;
//            }
//        }
//        OptionalDouble high = studentGrades.stream().mapToDouble(s -> s).max();
        Double high = studentGrades.stream().max(Comparator.comparing(Double::doubleValue)).get();
        return high;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentGrades=" + studentGrades +
                ", name='" + name + '\'' +
                ", studentLevel=" + studentLevel +
                '}';
    }
}
