package test;

import io.turntabl.java.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void getAverageOfTwoGrades(){
        Student std1 = new Student(Arrays.asList(1.0,2.0));
        assertEquals(1.5, std1.getAverageGrade());
    }
    @Test
    public void getAverageofThreeGrades(){
        Student std2 = new Student(Arrays.asList(1.0,4.0,10.0));
        assertEquals(5.0, std2.getAverageGrade());
    }

}