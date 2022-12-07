package model;

import enumeration.Course;
import implementation_services.PrincipalImplementation;
import implementation_services.StudentImplementation;
import implementation_services.TeacherImplementation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        LocalDate.now();
//        Student student = new Student("glory", 2,2000);
//        System.out.println(student);
        Applicant applicant = new Applicant("Esther" , 17.0 , 2002);
        PrincipalImplementation implementation = new PrincipalImplementation();

       // implementation.admitAStudent(applicant);

        implementation.admitAStudent(applicant);


     //   implementation.expelAStudent("Esther");

       // System.out.println();
        Teacher teacher = new Teacher("Judith", 7);
        TeacherImplementation newImplementation = new TeacherImplementation();
        newImplementation.canTeachACourse(Course.BCH67, teacher);



        Student student = new Student("Best",2,15);
        StudentImplementation implemented = new StudentImplementation();
        implemented.canTakeACourse(Course.BCH_412, student);

    }
}
