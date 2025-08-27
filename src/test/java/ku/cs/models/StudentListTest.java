package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;
    @BeforeEach
    void init() {
        studentList = new StudentList();

        studentList.addNewStudent("6718xxxx", "test1");
        studentList.addNewStudent("6719xxxx", "test2", 56);
        studentList.addNewStudent("6720xxxx", "test3");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียน")
    void testAddNewStudent() {
        studentList.addNewStudent("6721xxxx", "test4");
        assertEquals(studentList.getStudents().get(3) , studentList.findStudentById("6721xxxx"));
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนแบบมีคะแนน")
    void testAddNewStudentWithScore() {
        studentList.addNewStudent("6721xxxx", "test4", 12.56);
        assertEquals(12.56, studentList.findStudentById("6721xxxx").getScore());
    }

    @Test
    @DisplayName("ทดสอบการหานักเรียนจากรหัสนิสิต")
    void testFindStudentById() {
        assertEquals(studentList.getStudents().get(1) , studentList.findStudentById("6719xxxx"));
    }

    @Test
    @DisplayName("ทดสอบการหาชื่อด้วยตัวอักษร")
    void testFilterByName() {
        StudentList filtered = studentList.filterByName("T");

        assertEquals(studentList.getStudents(), filtered.getStudents());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนนจากรหัสนิสิต")
    void testGiveScoreToId() {
        studentList.giveScoreToId("6719xxxx", 4);

        assertEquals(60, studentList.findStudentById("6719xxxx").getScore());
    }

    @Test
    @DisplayName("ทดสอบการดูเกรดจากรหัสนิสิต")
    void testViewGradeOfId() {
        assertEquals("D", studentList.viewGradeOfId("6719xxxx"));
    }
}