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
    @DisplayName("ทดสอบการหานักเรียนจากรหัสนิสิต")
    void testFindStudentById() {
        assertEquals(studentList.getStudents().get(1) , studentList.findStudentById("6719xxxx"));
    }

    @Test
    @DisplayName("")
    void testFilterByName() {
        assertEquals(studentList.getStudents(), studentList.filterByName("test"));
    }
}