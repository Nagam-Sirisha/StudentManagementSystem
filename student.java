// File: Student.java
public class Student {
    private int rollNo;
    private String name;
    private String course;

    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Course: " + course;
    }
}
