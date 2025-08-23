package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeAll
    static void intit(){
         s = new Student("67104xxxxx", "Test");
    }

//    @BeforeEach
//    void setup(){
//        s = new Student("67104xxxxx" , "Test");
//    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.5")
    void testAddScore(){
        s = new Student("67104xxxxx", "Test");
        s.addScore(45.5);
        assertEquals(45.5,s.getScore());
    }

    @Test
    void testCalculateGrade(){
        s = new Student("67104xxxxx", "Test");
        s.addScore(1);
        assertEquals("F",s.getGrade());
    }

    @Test
    void testIsID(){
        s = new Student("67104xxxxx", "Test");
        assertTrue(s.isId("67104xxxxx"));
    }

    @Test
    void testIsNameContains(){
        s = new Student("67104xxxxx", "Test");
        assertTrue(s.isNameContains("t"));
    }
}