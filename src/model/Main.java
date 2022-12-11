package model;

import enumeration.Course;
import implementationServices.PrincipalImplementation;
import implementationServices.StudentImplementation;
import utility.ReaderFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        LocalDate.now();
//        Student student = new Student("glory", 2,2000);
//        System.out.println(student);
        Applicant applicant = new Applicant("Esther" , 18.0, "esther@example.com", 2002);
        Applicant applicant2 = new Applicant("Esther" , 18.0, "esther@example.com", 2002);
        PrincipalImplementation implementation = new PrincipalImplementation();

       // implementation.admitAStudent(applicant);

        implementation.admitAStudent(applicant);
        implementation.admitAStudent(applicant2);


     //  implementation.expelAStudent("Esther");

       // System.out.println();
//        Teacher teacher = new Teacher("Judith", 7);
//        TeacherImplementation newImplementation = new TeacherImplementation();
//        newImplementation.canTeachACourse(Course.BCH67, teacher);
//
//

        Student student = new Student();
        Teacher teacher = new Teacher();
        ReaderFile  readerFile = new ReaderFile();
         ArrayList<Object> studentArrayList =  readerFile.canReadFromAFile("src/utility/StudentDataFile.csv" , student);
         ArrayList<Object> teachersList =  readerFile.canReadFromAFile("src/utility/TeacherDataFile.csv" , teacher);


//       for (Object student1 : studentArrayList){
//           System.out.println("Got here");
//           System.out.println(student1.toString());
//       }
//        implemented.canReadFromAFile("src/utility/StudentDataFile.csv" , Teacher.class);
//        implemented.canTakeACourse(Course.BCH_412, student);
//        implemented.canTakeACourse(Course.BCH_412, student);

       try {
           BufferedReader studentReader = new BufferedReader(new FileReader("StudentDataFile"));
       }
       catch (FileNotFoundException e){
           e.fillInStackTrace();
       }

    }
}
