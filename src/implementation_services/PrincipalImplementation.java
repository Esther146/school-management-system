package implementation_services;

import interface_service.PrincipalInterface;
import model.Applicant;
import model.Principal;
import model.Student;

import java.time.LocalDate;
import java.util.Random;

public class PrincipalImplementation implements PrincipalInterface {

    @Override
    public Student admitAStudent(Applicant applicant) {
        Student student = null; 
        Random random = new Random();
       if (applicant.getAge() >= 18 ){
           student = new Student(applicant.getName(), random.nextInt(), LocalDate.now().getYear());
           Principal.students.add(student);
           System.out.println(applicant.getName() + " has been Admitted to the school");
       }else {
           System.out.println("Sorry UnderAge!!!!");
       }
       
       return  student;
    }

    @Override
    public void expelAStudent(String studentName) {
            if (findIndexOfStudent(studentName) > -1){
                Student student = Principal.students.get(findIndexOfStudent(studentName));
                Principal.students.remove(student);
                System.out.println(studentName+  "  Has been Expelled From this school");

            }
    }

    private int findIndexOfStudent(String studentName){
        for (Student student :  Principal.students){
            if (student.getName().equalsIgnoreCase(studentName)){
                return Principal.students.indexOf(student);
            }
        }
        return  -1;
    }

}
