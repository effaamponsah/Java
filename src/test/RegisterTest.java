package test;

import io.turntabl.java.Level;
import io.turntabl.java.Nameable;
import io.turntabl.java.Register;
import io.turntabl.java.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    @Test
    public void testNames(){
        List<Student> students=  Arrays.asList(
                new Student(Arrays.asList(1.0,2.0),"James", Level.First),
                new Student(Arrays.asList(1.0,2.0),"Kofi", Level.Second),
                new Student(Arrays.asList(6.0,2.0),"Sam", Level.First)
        );
        Register rgs = new Register(students);
        List<String> names = new ArrayList<>();
        for (Nameable name: students) {
            names.add(name.getName());
        }
        assertEquals(names, rgs.getRegister());
    }

    @Test
    public void testgetRegisterdByLevel(){
        Student std1 = new Student(Arrays.asList(1.0,2.0),"James", Level.First);
        Student std2 = new Student(Arrays.asList(3.0,2.0),"Mensah", Level.Third);
        Student std3 = new Student(Arrays.asList(6.0,2.0),"Sam", Level.First);

        Register register2 = new Register(Arrays.asList(std1,std2,std3));
        register2.getRegisterByLevel(Level.Third);
    }

}