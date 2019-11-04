package io.turntabl.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    Bag<Student> studentBag = new Bag<>();
    Student std1 = new Student(Arrays.asList(1.0,2.0),"James", Level.First);

    @Test
     void add() {
        studentBag.add(std1);
        assertNotEquals(0,studentBag.getLength());
    }
    @Test
    void viewBag() {
        studentBag.add(std1);
        assertEquals(Arrays.asList(std1), studentBag.viewBag());
    }

    @Test
    void remove() {
        studentBag.add(std1);
        studentBag.remove(std1);
        assertEquals(0, studentBag.getLength());
    }

    @Test
    void clear() {
        studentBag.add(std1);
        studentBag.add(std1);
        studentBag.clear();
        assertEquals(0, studentBag.getLength());
    }


}