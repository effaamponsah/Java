package io.turntabl.java;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
     List<Student> students = new ArrayList<>();
     
    public void enter(Student std) {
        this.students.add(std);
    }

    public Double getHighestGrade() {
        Double highest =0.0;
        /*for (Student std: students
             ) {
            if (std.getAverageGrade() > highest) {
                highest = std.getAverageGrade();
            }
        }
         */
        highest = students.stream().mapToDouble(student -> student.getAverageGrade()).max().orElseThrow();
        return highest;
    }
}
