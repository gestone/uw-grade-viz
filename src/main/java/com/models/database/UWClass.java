package com.models.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "classes")
public class UWClass implements Serializable {

    @Id private int year;
    @Id private int quarter;
    @Id private String courseNumber;

    @Column(name = "course_title")
    private String courseTitle;

    @Column(name = "instructor")
    private String instructor;

    @Column(name = "student_count")
    private int studentCount;

    @Column(name = "num_a")
    private int numAs;

    @Column(name = "num_a_minus")
    private int numAMinus;

    @Column(name = "num_b_plus")
    private int numBPlus;

    @Column(name = "num_b")
    private int numB;

    @Column(name = "num_b_minus")
    private int numBMinus;

    @Column(name = "num_c_plus")
    private int numCPlus;

    @Column(name = "num_c")
    private int numC;

    @Column(name = "num_c_minus")
    private int numCMinus;

    @Column(name = "num_d_plus")
    private int numDPlus;

    @Column(name = "num_d")
    private int numD;

    @Column(name = "num_d_minus")
    private int numDMinus;

    @Column(name = "num_f")
    private int numF;

    @Column(name = "num_w")
    private int numWithdrawn;

    @Column(name = "average_gpa")
    private float averageGpa;

    public UWClass() {

    }

    public float getAverageGpa() {
        return averageGpa;
    }

    public void setAverageGpa(float averageGpa) {
        this.averageGpa = averageGpa;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getNumAs() {
        return numAs;
    }

    public void setNumAs(int numAs) {
        this.numAs = numAs;
    }

    public int getNumAMinus() {
        return numAMinus;
    }

    public void setNumAMinus(int numAMinus) {
        this.numAMinus = numAMinus;
    }

    public int getNumBPlus() {
        return numBPlus;
    }

    public void setNumBPlus(int numBPlus) {
        this.numBPlus = numBPlus;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumBMinus() {
        return numBMinus;
    }

    public void setNumBMinus(int numBMinus) {
        this.numBMinus = numBMinus;
    }

    public int getNumCPlus() {
        return numCPlus;
    }

    public void setNumCPlus(int numCPlus) {
        this.numCPlus = numCPlus;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public int getNumCMinus() {
        return numCMinus;
    }

    public void setNumCMinus(int numCMinus) {
        this.numCMinus = numCMinus;
    }

    public int getNumDPlus() {
        return numD;
    }

    public void setNumDPlus() {
        this.numDPlus = numDPlus;
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public int getNumDMinus() {
        return numDMinus;
    }

    public void setNumDMinus(int numDMinus) {
        this.numDMinus = numDMinus;
    }

    public int getNumF() {
        return numF;
    }

    public void setNumF(int numF) {
        this.numF = numF;
    }

    public int getNumWithdrawn() {
        return numWithdrawn;
    }

    public void setNumWithdrawn(int numWithdrawn) {
        this.numWithdrawn = numWithdrawn;
    }

}
