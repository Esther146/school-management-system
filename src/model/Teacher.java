package model;

import enumeration.Course;

import java.util.ArrayList;

public class Teacher extends Base{

    public  ArrayList<Course> courses = new ArrayList<>();

    public Teacher(String name, int identityNum) {
        super(name, identityNum);
    }
}
