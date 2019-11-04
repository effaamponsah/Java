package io.turntabl.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bag<T> {
    List<T> list = new ArrayList<>();


    public void add(T s){
        this.list.add(s);
    }
    public void remove(T s){
        this.list.remove(s);
    }
    public void clear(){
        this.list.clear();
    }

    public List<T> viewBag(){
        return  list;
    }
    public int getLength(){
        return list.size();
    }
}
