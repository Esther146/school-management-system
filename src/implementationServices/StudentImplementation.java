package implementationServices;

import enumeration.Course;
import interfaceService.StudentService;
import model.Principal;
import model.Student;
import model.Teacher;

import java.io.*;
import java.util.ArrayList;

public class StudentImplementation implements StudentService {

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

    public ArrayList<Object> canReadFromAFile(String filePath , Object object){
      //  String filePath = "StudentDataFile.csv";
        ArrayList<Object> arrayList = new ArrayList<>();
        String fileLine = " ";
      try {
          BufferedReader studentReader = new BufferedReader(new FileReader(filePath));
          while((fileLine = studentReader.readLine()) != null){
              String[]  arrayValues = fileLine.split(",");
              System.out.println(fileLine);
              if (object instanceof  Student){
                object  = new Student(arrayValues[0] , , arrayValues[2]);
                  arrayList.add(object);
              } else if (object instanceof Teacher ) {
                  object = new Teacher(arrayValues[0], , arrayValues[2]);
                  arrayList.add(object);
              } else if (object instanceof Course){
                  arrayList.add(object);
              }
          }
      }
      catch (IOException e){
          e.printStackTrace();
      }

      return  arrayList;
    }
}
