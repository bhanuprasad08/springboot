package com.example.school.model;

public class Student {
    private int studentId;
    private String studentName;
    private int standard;
    private String gender;

    public Student(int studentId, String studentName, int standard, String gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.standard = standard;
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
