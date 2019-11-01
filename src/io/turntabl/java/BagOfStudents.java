package io.turntabl.java;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
    List<Student> students = new ArrayList<>();

    public void add(Student s){
        this.students.add(s);
    }
    public void remove(Student s){
        this.students.remove(s);
    }
    public void clear(){
        this.students.clear();
    }
}
