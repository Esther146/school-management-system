package model;

public abstract class Base {
    private String name;
    private int identityNum;
    private int dateJoined;
    private double age;
    private int yearOfBirth;

    private String email;

    public Base(String name){
        this.name = name;
    }

    public Base(String name, int identityNum){
        this.name = name;
        this.identityNum = identityNum;
    }

    public Base(String name, double age,String email, int yearOfBirth){
        this.name = name;
        this.age = age;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
    }

    public Base(String name, int identityNum, String email, int dateJoined) {
        this.name = name;
        this.identityNum = identityNum;
        this.dateJoined = dateJoined;
        this.email = email;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(int identityNum) {
        this.identityNum = identityNum;
    }

    public int getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(int dateJoined) {
        this.dateJoined = dateJoined;
    }

    public  double getAge(){
        return age;
    }

    public void setAge(double age){
        this.age = age;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Base{" +
                "name='" + name + '\'' +
                ", identityNum=" + identityNum +
                ", dateJoined=" + dateJoined +
                ", age=" + age +
                ", yearOfBirth=" + yearOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}

