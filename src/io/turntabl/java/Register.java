package io.turntabl.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Register{
    List<Nameable> nameables;
    List<Student> stds;

    public Register(List<Student> stds) {
        this.stds = stds;
    }

    public List<String> getRegister(){
        List<String> names = new ArrayList<>();
        for (Student std: stds) {
            names.add(std.getName());
        }
        return names;
    }

    /*public List<String> getRegisterByLevel(Level level){
        List<String> names = new ArrayList<>();
        for (Student std: stds) {
            if (std.getLevel() == level) {
                names.add(std.getName());
            }
        }
        return names;
    }

     */
    public Map<Level, List<Student>> getRegisterByLevel(Level level){
        Map<Level, List<Student>> names = new HashMap<>();

        return names;
    }

    public void PrintReport(){
        List<String> all = new ArrayList<>();
        List<String> year1 = new ArrayList<>();
        List<String> year2 = new ArrayList<>();
        List<String> year3 = new ArrayList<>();
        for (Nameable name: nameables
             ) {
            switch (name.getLevel()){
                case First:
                    year1.add(name.getName());
                    break;
                case Second:
                    year2.add(name.getName());
                    break;
                case Third:
                    year3.add(name.getName());
                    break;
            }
        }
    }


}
