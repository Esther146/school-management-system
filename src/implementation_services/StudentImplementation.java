package implementation_services;

import enumeration.Course;
import enumeration.Level;
import interface_service.StudentInterface;
import model.Principal;
import model.Student;

public class StudentImplementation implements StudentInterface {

    @Override
    public void canTakeACourse(Course course, Student student) {
       if (isAStudent(student.getEmail())){
           if(student.courses.contains(course)){
               System.out.println("You are already studying this course");
           }else {
               student.courses.add(course);
               System.out.println("You are now studying this course" + course);
           }
       }else {
           System.out.println("You are not eligible to take the course!");
       }
    }

    private boolean isAStudent (String studentEmail){
        for(Student student : Principal.students){
            if(student.getEmail().equalsIgnoreCase(studentEmail)){
                return true;
            }
        }
        return false;
    }
}
