package test;

import io.turntabl.java.Lecture;
import io.turntabl.java.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    @Test
    public void testHighest(){
      Lecture lt = new Lecture();
      lt.enter(new Student(Arrays.asList(1.0,4.0,10.0)));
      lt.enter(new Student(Arrays.asList(1.0,2.0)));

      assertEquals(5.0, lt.getHighestGrade());




    }

}