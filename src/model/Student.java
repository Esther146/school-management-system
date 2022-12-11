package model;

import enumeration.Course;

import java.io.File;
import java.util.ArrayList;

public class Student extends Base{

    public ArrayList<Course> courses = new ArrayList<>();

    public Student() {
        super();
    }

    public Student(String name, int identityNum, String email, String dateJoined) {
        super(name, identityNum, email, dateJoined);
    }



}
