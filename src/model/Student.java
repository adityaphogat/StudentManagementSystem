package model;

public class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    
    public Student(int rollNo, String name, String email, String course, double marks) {
        super(name, email); 
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade(); 
    }

    
    private void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
    }

    @Override
    public void displayInfo() {
        System.out.println("\nRoll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");
    }

    
    public int getRollNo() { return rollNo; }
    public double getMarks() { return marks; }
    public String getCourse() { return course; }

    
    public String toCSV() {
        return rollNo + "," + name + "," + email + "," + course + "," + marks;
    }
}