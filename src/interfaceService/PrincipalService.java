package interfaceService;

import model.Applicant;
import model.Student;

public interface PrincipalService {
    Student admitAStudent(Applicant applicant);

    void expelAStudent(String studentName);


}
