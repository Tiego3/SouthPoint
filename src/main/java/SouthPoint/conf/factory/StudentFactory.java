package SouthPoint.conf.factory;

import SouthPoint.Domain.Student;

/**
 * Created by student on 2015/10/17.
 */
public class StudentFactory {

    public static Student createStudent(String studentNumber, String name, String surname, String gender){
        Student student = new Student
                .Builder(studentNumber)
                .name(name)
                .surname(surname)
                .gender(gender)
                .build();
        return student;
    }
}
