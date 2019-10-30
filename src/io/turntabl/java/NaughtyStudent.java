package io.turntabl.java;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> studentGrades) {
        super(studentGrades);
    }
    @Override
    public Double getAverageGrade() {
        return  super.getAverageGrade() + (super.getAverageGrade() * 0.1);
    }
}
