package model;

import enumeration.Course;
import implementation_services.PrincipalImplementation;

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
    }
}
