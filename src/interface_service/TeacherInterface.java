package interface_service;

import enumeration.Course;
import model.Teacher;

public interface TeacherInterface {
    void canTeachACourse(Course course , Teacher teacher);
}
