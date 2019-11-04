package io.turntabl.java;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers {
    List<Lecture> lectures = new ArrayList<>();

    public void add(Lecture l){
        this.lectures.add(l);
    }
    public void remove(Lecture l){
        this.lectures.remove(l);

    }
    public void clear(){
        this.lectures.clear();
    }
}
