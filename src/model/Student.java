package model;

import enumeration.Course;

import java.util.ArrayList;

public class Student extends Base{


    public ArrayList<Course> courses = new ArrayList<>();

    public Student(String name, int identityNum, int dateJoined) {
        super(name, identityNum, dateJoined);
    }


}
