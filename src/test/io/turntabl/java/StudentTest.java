package io.turntabl.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StudentTest {
    @Test
    public void getAverageOfTwoGrades(){
        Student std1 = new Student(Arrays.asList(1.0,2.0),"James", Level.First);
        assertEquals(1.5, std1.getAverageGrade());
    }
    @Test
    public void getAverageofThreeGrades(){
        Student std2 = new Student(Arrays.asList(1.0,4.0,10.0), "Kwame", Level.First);
        assertEquals(5.0, std2.getAverageGrade());
    }
    @Test
    public void getGradesTest(){
        Student std2 = new Student(Arrays.asList(1.0,4.0,10.0), "Kwame", Level.First);
        std2.getGrade();
//        assertEquals(DoubleStream.of(1.0,4.0,10.0), std2.getGrade());
    }

    @Test
    public void testNaughtyStudentIsAStudent(){
        Student std =  new NaughtyStudent(Arrays.asList(1.0,4.0,10.0), "Kwame", Level.First);
        assertEquals(5.5, std.getAverageGrade());
    }
    @Test
    public void testNaughtyStudentIncreaseGrade() {
        NaughtyStudent nst1 =  new NaughtyStudent(Arrays.asList(1.0,4.0,10.0), "Kwame", Level.First);
        assertNotEquals(5.0, nst1.getAverageGrade(), "Students increases grade");

    }
    @Test
    public void highestGrade(){
        Student std =  new NaughtyStudent(Arrays.asList(1.0,4.0,10.0), "Kwame", Level.First);
        assertEquals(10.0, std.highestGrade());
    }




}