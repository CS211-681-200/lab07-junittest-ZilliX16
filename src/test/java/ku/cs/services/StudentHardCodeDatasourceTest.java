package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    StudentList list;
    StudentHardCodeDatasource test;
    @BeforeEach
    void init() {

        test = new StudentHardCodeDatasource();
    };

    @Test
    @DisplayName("ทดสอบ readData")
    void testReaddata() {
        StudentList actual = test.readData();
        assertEquals("First", actual.findStudentById("6710400001").getName());
        assertEquals("Second", actual.findStudentById("6710400002").getName());
        assertEquals("Third", actual.findStudentById("6710400003").getName());
        assertEquals("Fourth", actual.findStudentById("6710400004").getName());
    }

}