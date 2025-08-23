package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    @Test
    void testReadData(){
        StudentHardCodeDatasource list = new StudentHardCodeDatasource();
        assertEquals(4,list.readData().getStudents().size());
    }
}