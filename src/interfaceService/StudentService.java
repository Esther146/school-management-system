package interfaceService;

import enumeration.Course;
import model.Student;

public interface StudentService {
    void canTakeACourse(Course course, Student student);
}
