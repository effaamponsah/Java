package io.turntabl.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Register{
    List<Nameable> nameables;
    List<Student> stds;
    List<Level> lvs;

    public Register(List<Student> stds) {
        this.stds = stds;
    }

/*    public List<String> getRegister(){
      List<String> names = new ArrayList<>();
        for (Student std: stds) {
            names.add(std.getName());
        }
        return names;
    }
*/
    public List<String> getRegister(){
        List<String> names = stds.stream().map(student -> student.getName()).collect(Collectors.toList());
        return names;
    }

   /* public List<String> getRegisterByLevel(Level level){
        List<String> names = new ArrayList<>();
        for (Student std: stds) {
            if (std.getLevel() == level) {
                names.add(std.getName());
            }
        }
        return names;
    }
    */
   public List<Student> getRegisterByLevel(Level level){
       List<Student> names = stds.stream().filter(student -> student.getLevel() == level).collect(Collectors.toList());
       return names;
   }


    public void PrintReport(){
        List<String> year1 = new ArrayList<>();
        List<String> year2 = new ArrayList<>();
        List<String> year3 = new ArrayList<>();
        for (Student std: stds) {
            switch (std.getLevel()){
                case First:
                    year1.add(std.getName());
                    break;
                case Second:
                    year2.add(std.getName());
                    break;
                case Third:
                    year3.add(std.getName());
                    break;
            }
        }

            for (Level lv: Level.values()
                 ) {
               switch (lv){
                   case First:
                       System.out.println(lv);
                       for (String s: year1
                            ) {
                           System.out.println(s);
                       }
                       break;
                   case Second:
                       System.out.println(lv);
                       for (String s: year2
                       ) {
                           System.out.println(s);
                       }
                       break;
                   case Third:
                       System.out.println(lv);
                       for (String s: year3
                       ) {
                           System.out.println(s);
                       }
                       break;
               }

            }

    }


}
