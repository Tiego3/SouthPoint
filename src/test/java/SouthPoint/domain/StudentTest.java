package SouthPoint.domain;

import SouthPoint.Domain.Student;
import SouthPoint.conf.factory.StudentFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/10/17.
 */
public class StudentTest {

    @Test
    public void testCreate() throws Exception {
        Student student = StudentFactory
                .createStudent("213037041", "Tee", "Math", "Female");
        Assert.assertEquals("213037041", student.getStudentNumber());
    }

    @Test
    public void testUpdate() throws Exception {
        Student student = new Student.Builder("213037041")
                .name("Tee")
                .id(new Long(3))
                .build();
        Student newstudent = new Student
                .Builder(student.getStudentNumber())
                .copy(student)
                .name("Tiego").build();

        Assert.assertEquals("Tiego",newstudent.getName());
        Assert.assertEquals("213037041",newstudent.getStudentNumber());
        Assert.assertEquals("213037041",student.getStudentNumber());

    }
}
