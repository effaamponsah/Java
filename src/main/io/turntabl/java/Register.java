package io.turntabl.java;

import java.util.*;
import java.util.stream.Collectors;

public class Register{
    List<Nameable> nameables;
    List<Student> stds;
    List<Level> lvs;
    private Exception StudentNotFoundErr;

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
        List<String> names = stds.stream()
                .map(student -> student.getName())
                .collect(Collectors.toList());
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

  public List<String> getRegisterByLevel(Level level){
      List<String> names = stds.stream()
              .filter(student -> student.getLevel() == level)
              .map(student -> student.getName())
              .collect(Collectors.toList());
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

    /*
//    Throws exception using standard Exception
  public Student getStudentByNameAndThrowsException (String name) throws Exception {
         Student student = null;
         for (Student std: stds) {
            if (  std.getName() == name) {
                student = std;
            }
            else {
              throw StudentNotFoundErr;
            }

        }
        return student;
     }

     */

    public Student getStudentByNameAndThrowsException (String name) throws StudentNotFoundException {
        Student student = null;
        for (Student std: stds) {
            if (  std.getName() == name) {
                student = std;
            }
            else {
                throw new StudentNotFoundException("Student not found error");
            }

        }
        return student;
    }

    public Double highestGrade(){
      Double h = 0.0;
         for (Student s: stds) {
             for (Double d: s.studentGrades
                  ) {
                 if (d > h){
                     h= d;
                 }
             }
         }
        return h;
     }

  public void getStudentByNameWithOptionalType (String name)  {
//        Student student = null;
//        for (Student std: stds) {
//            if (  std.getName() == name) {
//                student = std;
//            }
//            else {
//                System.out.println("Empty");
//            }
//
//        }

    }


    public  Optional<List<Student>> testing(Student s){
//        Optional<Student> optional =Optional.empty();
//        Optional<Student> optional =Optional.of(s);
//        optional.ifPresent(student -> student.getName());
//        System.out.println(optional.get());
        Optional<List<Student>> su = Optional.of(stds);
        su.map(Collection::stream);
        return su;
    }

    //    public void testing(){
    //        Optional<List<Student>> u = Optional.of(stds);
    ////        Optional<String> nm = u.filter(student -> student.getName() =="James").map(Student::getName);
    //        Optional<String> nm = u.filter(students -> students.stream().filter(student -> student.getName() == "Demm").map())
    //        System.out.println(nm.get());
    //    }



}
