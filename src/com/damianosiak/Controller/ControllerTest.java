package com.damianosiak.Controller;

import com.damianosiak.Model.Student;
import org.junit.jupiter.api.Test;

import static com.damianosiak.Model.Student.StudentClass.CLASS1;
import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    /**
     * This test is responsible for testing create and read student function
     */
    @Test
    void createAndReadStudent() {
        Controller.createStudent("Bob","Marley","Chicago","Secret","+1-203-332-4854",1992,11,5);
        assertEquals("Bob",Controller.students.get(0).getStudentFirstName());
        assertEquals("Marley",Controller.students.get(0).getStudentLastName());
        assertEquals("Chicago",Controller.students.get(0).getStudentCity());
        assertEquals("Secret",Controller.students.get(0).getStudentAddress());
        assertEquals("+1-203-332-4854",Controller.students.get(0).getStudentPhoneNumber());
        assertEquals(1992,Controller.students.get(0).getStudentBirthdayYear());
        assertEquals(11,Controller.students.get(0).getStudentBirthdayDay());
        assertEquals(5,Controller.students.get(0).getStudentBirthdayMonth());
    }


    /**
     * This test is responsible for testing update student function
     */
    @Test
    void updateStudent() {
        Controller.createStudent("Bob","Marley","Chicago","Secret","+1-203-332-4854",1992,11,5);
        Controller.updateStudent(0,"Betty","Marley","Los Santos","Vinewood","+1-203-332-4854",1992,11,5);
        assertEquals("Betty",Controller.students.get(0).getStudentFirstName());
        assertEquals("Marley",Controller.students.get(0).getStudentLastName());
        assertEquals("Los Santos",Controller.students.get(0).getStudentCity());
        assertEquals("Vinewood",Controller.students.get(0).getStudentAddress());
        assertEquals("+1-203-332-4854",Controller.students.get(0).getStudentPhoneNumber());
        assertEquals(1992,Controller.students.get(0).getStudentBirthdayYear());
        assertEquals(11,Controller.students.get(0).getStudentBirthdayDay());
        assertEquals(5,Controller.students.get(0).getStudentBirthdayMonth());
    }

    /**
     * This test is responsible for testing delete student function
     */
    @Test
    void deleteStudent() {
        Controller.createStudent("Bob","Marley","Chicago","Secret","+1-203-332-4854",1992,11,5);
        assertEquals(1,Controller.students.size());
        Controller.deleteStudent(0);
        assertEquals(0,Controller.students.size());
    }

    /**
     * This test is responsible for testing add student to class function
     */
    @Test
    void addStudentToClass() {
        Controller.createStudent("Bob","Marley","Chicago","Secret","+1-203-332-4854",1992,11,5);
        assertEquals(null,Controller.students.get(0).getStudentClass());
        Controller.addStudentToClass(0,"CLASS1");
        assertEquals("CLASS1",Controller.students.get(0).getStudentClass().name());
    }

    /**
     * This test is responsible for testing generate random student function
     */
    @Test
    void generateStudent() {
        assertEquals(0,Controller.students.size());
        Controller.generateStudent("male");
        assertEquals(1,Controller.students.size());
    }

    /**
     * This test is responsible for testing save DB to file and import DB from file function
     */
    @Test
    void saveDBandLoadDB() {
        Controller.createStudent("Bob","Marley","Chicago","Secret","+1-203-332-4854",1992,11,5);
        assertEquals(1,Controller.students.size());
        Controller.saveDB("testdb");
        Controller.loadDB(false,"testdb");
        assertEquals(2,Controller.students.size());
    }

}