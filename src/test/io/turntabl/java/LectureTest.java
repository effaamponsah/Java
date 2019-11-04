package io.turntabl.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LectureTest {
    @Test
    public void testHighest(){
      Lecture lt = new Lecture();
      lt.enter(new Student(Arrays.asList(1.0,4.0,10.0),"James", Level.First));
      lt.enter(new Student(Arrays.asList(1.0,2.0), "Sam", Level.Second));

      assertEquals(5.0, lt.getHighestGrade());
    }

    @Test
    public void testNaughtyStudent(){
        Lecture lecture = new Lecture();
        lecture.enter(new Student(Arrays.asList(2.0,4.0), "Dennis", Level.First));
        lecture.enter(new Student(Arrays.asList(4.0,2.0), "Effa", Level.First));
        lecture.enter( new NaughtyStudent(Arrays.asList(2.0,4.0), "Mensah", Level.First));

        assertNotEquals(3, lecture.getHighestGrade());
    }

}