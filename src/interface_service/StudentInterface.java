package interface_service;

import enumeration.Course;
import enumeration.Level;
import model.Student;

public interface StudentInterface {
    void canTakeACourse(Course course, Student student);
}
