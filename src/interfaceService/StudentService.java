package interfaceService;

import enumeration.Course;
import model.Student;

import java.io.File;
import java.util.ArrayList;

public interface StudentService {
    void canTakeACourse(Course course, Student student);

}
