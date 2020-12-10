package com.damianosiak.Model;

/**
 * This class is responsible for Student object, who contains information like: first name, last name, city, address, phone number, birthday year, birthday day and birthday month
 Student class contains enum with all 'class' (in school meaning)
 This class is also contains basic methods, setters, getters, constructors etc
 */
public class Student {
    private String studentFirstName;
    private String studentLastName;
    private String studentCity;
    private String studentAddress;
    private String studentPhoneNumber;
    private Integer studentBirthdayYear;
    private Integer studentBirthdayDay;
    private Integer studentBirthdayMonth;
    private StudentClass studentClass;

    /**
     * This enum contains information about any class
     */
    public enum StudentClass{
        CLASS1("Denzel Washington","Computer Science","Local IT Center"),
        CLASS2("Tom Hanks","Music","Building no.2"),
        CLASS3("Clint Eastwood","Military","Barrack");

        private String classTeacher;
        private String classProfile;
        private String classBuilding;
        StudentClass(String classTeacher, String classProfile, String classBuilding){
            this.classTeacher=classTeacher;
            this.classProfile=classProfile;
            this.classBuilding=classBuilding;
        }

        public String getClassTeacher(){
            return classTeacher;
        }

        public String getClassProfile(){
            return classProfile;
        }

        public String getClassBuilding(){
            return classBuilding;
        }

        @Override
        public String toString() {
            return "Class{" +
                    "classTeacher='" + classTeacher + '\'' +
                    ", classProfile='" + classProfile + '\'' +
                    ", classBuilding='" + classBuilding + '\'' +
                    '}';
        }
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public Integer getStudentBirthdayYear() {
        return studentBirthdayYear;
    }

    public void setStudentBirthdayYear(Integer studentBirthdayYear) {
        this.studentBirthdayYear = studentBirthdayYear;
    }

    public Integer getStudentBirthdayDay() {
        return studentBirthdayDay;
    }

    public void setStudentBirthdayDay(Integer studentBirthdayDay) {
        this.studentBirthdayDay = studentBirthdayDay;
    }

    public Integer getStudentBirthdayMonth() {
        return studentBirthdayMonth;
    }

    public void setStudentBirthdayMonth(Integer studentBirthdayMonth) {
        this.studentBirthdayMonth = studentBirthdayMonth;
    }

    public StudentClass getStudentClass(){
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass){
        this.studentClass = studentClass;
    }

    public Student() {
    }

    public Student(String studentFirstName, String studentLastName, String studentCity, String studentAddress, String studentPhoneNumber, Integer studentBirthdayYear, Integer studentBirthdayDay, Integer studentBirthdayMonth) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentCity = studentCity;
        this.studentAddress = studentAddress;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentBirthdayYear = studentBirthdayYear;
        this.studentBirthdayDay = studentBirthdayDay;
        this.studentBirthdayMonth = studentBirthdayMonth;
    }

    /*@Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentPhoneNumber='" + studentPhoneNumber + '\'' +
                ", studentBirthdayYear=" + studentBirthdayYear +
                ", studentBirthdayDay=" + studentBirthdayDay +
                ", studentBirthdayMonth=" + studentBirthdayMonth +
                '}';
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentPhoneNumber='" + studentPhoneNumber + '\'' +
                ", studentBirthdayYear=" + studentBirthdayYear +
                ", studentBirthdayDay=" + studentBirthdayDay +
                ", studentBirthdayMonth=" + studentBirthdayMonth +
                ", studentClass=" + studentClass +
                '}';
    }
}
