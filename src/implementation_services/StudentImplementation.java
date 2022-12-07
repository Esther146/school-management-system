package implementation_services;

import enumeration.Course;
import enumeration.Level;
import interface_service.StudentInterface;
import model.Student;

public class StudentImplementation implements StudentInterface {

    @Override
    public void canTakeACourse(Course course, Student student) {
        if(student.courses.contains(course)){
            System.out.println("You are already studying this course");
        }else {
            student.courses.add(course);
            System.out.println("You are now studying this course");
        }
    }
}
