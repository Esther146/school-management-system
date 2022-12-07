package implementation_services;

import enumeration.Course;
import interface_service.TeacherInterface;
import model.Teacher;

public class TeacherImplementation implements TeacherInterface {
    @Override
    public void canTeachACourse(Course course , Teacher teacher) {
        if (getCourseIndexInTheListOfCourses(course, teacher) > -1){
            System.out.println("you are already teaching this course!!");
        }else{
            teacher.courses.add(course);
            System.out.println(" you are now teaching " + course);
        }
    }

    private int getCourseIndexInTheListOfCourses(Course course , Teacher teacher){
        for (Course aSingleCourseTaughtByTheteacher : teacher.courses){
            if (aSingleCourseTaughtByTheteacher.equals(course)){
              //  teacher.courses.contains(course);
                return  teacher.courses.indexOf(aSingleCourseTaughtByTheteacher);

            }
        }

        return  -1;
    }

}
