package interface_service;

import model.Applicant;
import model.Student;

public interface PrincipalInterface {
    Student admitAStudent(Applicant applicant);

    void expelAStudent(String studentName);
}
