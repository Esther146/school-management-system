package interfaceService;

import enumeration.Course;
import model.Teacher;

public interface TeacherService {
    void canTeachACourse(Course course , Teacher teacher);
}
