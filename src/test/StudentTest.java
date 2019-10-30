package test;

import io.turntabl.java.NaughtyStudent;
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

    @Test
    public void testNaughtyStudentIsAStudent(){
        Student std =  new NaughtyStudent(Arrays.asList(1.0,4.0,10.0));
        assertEquals(5.5, std.getAverageGrade());
    }
    @Test
    public void testNaughtyStudentIncreaseGrade() {
        NaughtyStudent nst1 =  new NaughtyStudent(Arrays.asList(1.0,4.0,10.0));
        assertNotEquals(5.0, nst1.getAverageGrade(), "Students increases grade");

    }




}