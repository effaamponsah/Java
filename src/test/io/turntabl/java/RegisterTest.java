package io.turntabl.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RegisterTest {
    @Test
    public void testNames(){
        List<Student> students=  Arrays.asList(
                new Student(Arrays.asList(1.0,2.0),"James", Level.First),
                new Student(Arrays.asList(1.0,2.0),"Kofi", Level.Second),
                new Student(Arrays.asList(6.0,2.0),"Sam", Level.First)
        );
        Register rgs = new Register(students);

        assertEquals(Arrays.asList("James", "Kofi", "Sam"), rgs.getRegister());
    }
    @Test
    public void testgetRegisterdByLevel(){
        Student std1 = new Student(Arrays.asList(1.0,2.0),"James", Level.First);
        Student std2 = new Student(Arrays.asList(3.0,2.0),"Mensah", Level.Third);
        Student std3 = new Student(Arrays.asList(6.0,2.0),"Sam", Level.Third);

        Register register2 = new Register(Arrays.asList(std1,std2,std3));
        //register2.getRegisterByLevel(Level.Third);
        assertEquals(Arrays.asList("Mensah", "Sam"),register2.getRegisterByLevel(Level.Third) );
    }
    @Test
    public void getByNameTestWithException(){
        Student std2 = new Student(Arrays.asList(1.0,2.0),"Mary", Level.First);
        Register rg = new Register(Arrays.asList(std2));
        try {
            assertNotEquals("Student{studentGrades=[1.0, 2.0], name='Mary', studentLevel=First}",rg.getStudentByNameAndThrowsException("Mar") );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getHighestGrade(){
        Student std2 = new Student(Arrays.asList(1.0,2.0),"Sam", Level.First);
        Student std3 = new Student(Arrays.asList(1.0,5.0),"Dennis", Level.First);

        Register rg = new Register(Arrays.asList(std2,std3));
        rg.highestGrade();
    }
    @Test
    public void testing(){
        Student std2 = new Student(Arrays.asList(1.0,2.0),"Me", Level.First);
        Register rg = new Register(Arrays.asList(std2));
        rg.testing(std2);
    }

}