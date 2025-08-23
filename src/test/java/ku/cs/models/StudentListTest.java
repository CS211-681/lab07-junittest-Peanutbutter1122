package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static StudentList s;
    @BeforeAll
    static void intit(){
        s = new StudentList();
    }

    @Test
    void testAddNewStudent1() {
        s = new StudentList();
        s.addNewStudent("67104xxxxx","Test");
        assertEquals("67104xxxxx",s.getStudents().get(0).getId());
        assertEquals("Test",s.getStudents().get(0).getName());
    }

    @Test
    void  testAddNewStudent2() {
        s = new StudentList();
        s.addNewStudent("67104xxxxx","Test",80.00);
        assertEquals("67104xxxxx",s.getStudents().get(0).getId());
        assertEquals("Test",s.getStudents().get(0).getName());
        assertEquals(80,s.getStudents().get(0).getScore());

    }

    @Test
    void testFindStudentById(){
        Student student;
        s = new StudentList();
        s.addNewStudent("67104xxxx1","Test3",80.00);
        s.addNewStudent("67104xxxx2","Test2",50.15);
        s.addNewStudent("67104xxxx3","Test3",99.99);

        student = s.findStudentById("67104xxxx2");
        assertEquals("67104xxxx2",student.getId());
        assertEquals("Test2",student.getName());
        assertEquals(50.15,student.getScore());


    }

    @Test
    void testFilterByName(){
        StudentList s = new StudentList();
        StudentList filtered = new StudentList();
        s.addNewStudent("67104xxxx1","Test1",80.00);
        s.addNewStudent("67104xxxx2","Test2",50.15);
        s.addNewStudent("67104xxxx3","Test3",99.99);
        s.addNewStudent("67104xxxx4","Test3",88.88);
        filtered = s.filterByName("Test3");
        filtered.getStudents().size();
        assertEquals(2,filtered.getStudents().size());
    }

    @Test
    void testGiveScoreToId(){
        StudentList s = new StudentList();
        s.addNewStudent("67104xxxx1","Test1",80.00);
        s.addNewStudent("67104xxxx2","Test2",50.15);
        s.addNewStudent("67104xxxx3","Test3",99.99);
        s.addNewStudent("67104xxxx4","Test3",88.88);

        s.giveScoreToId("67104xxxx1",10);
        assertEquals(90,s.getStudents().get(0).getScore());
    }

    @Test
    void testViewGradeOfId(){
        StudentList s = new StudentList();
        s.addNewStudent("67104xxxx1","Test1",80.00);
        s.addNewStudent("67104xxxx2","Test2",50.15);
        s.addNewStudent("67104xxxx3","Test3",99.99);
        s.addNewStudent("67104xxxx4","Test3",88.88);

        s.viewGradeOfId("67104xxxx1");
        assertEquals("A",s.getStudents().get(0).getGrade());
    }
}