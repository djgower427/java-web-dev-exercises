package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    protected void setName(String name){
        this.name = name;
    }
    protected void setStudentId(int studentId){
        this.studentId = studentId;
    }
    protected void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
    protected void setGpa(double gpa){
        this.gpa = gpa;
    }
    protected String getName(){
        return name;
    }
    protected int getStudentId(){
        return studentId;
    }
    protected int getNumberOfCredits(){
        return numberOfCredits;
    }
    protected double getGpa(){
        return gpa;
    }

}