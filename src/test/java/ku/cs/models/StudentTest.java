package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s;

    @BeforeEach
    void init() {
        s = new Student("671xxxx", "test");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 40.28 คะแนน")
    void testAddScore() {

        s.addScore(40.28);
        assertEquals(40.28, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 41.279 คะแนน และคำณวณเกรด")
    void testCalculateGrade() {

        s.addScore(41.279);
        assertEquals("F", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName() {
        s.changeName("test2");
        assertEquals("test2", s.getName());
    }

    @Test
    @DisplayName("ทดสอบการตรวจรหัสนิสิต")
    void testIsId() {
        assertEquals(s.isId("674854454"), false);
    }

    @Test
    @DisplayName("ทดสอบการตรวจชื่อ จากตัวอักษร")
    void testIsNameContains() {
        assertEquals(s.isNameContains("tes"), true);
    }
}