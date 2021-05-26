package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student1 = new Student();
        student1.setName("Dan");
        student1.setNumberOfCredits(1);
        student1.setGpa(4.0);
    }

    public class Course {
        private String title;
        private String professor;
        private ArrayList<Student> enrolledStudents;
    }

    protected class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private Integer yearsTeaching;

        protected void setFirstName(String firstName){
            this.firstName = firstName;
        }
        protected void setLastName(String lastName){
            this.lastName = lastName;
        }
        protected void setSubject(String subject){
            this.subject = subject;
        }
        protected void setYearsTeaching(Integer yearsTeaching){
            this.yearsTeaching = yearsTeaching;
        }
        protected String getFirstName(){
            return firstName;
        }
        protected String getLastName(){
            return lastName;
        }
        protected String getSubject(){
            return subject;
        }
        protected Integer getYearsTeaching(){
            return yearsTeaching;
        }
    }
}
