// File: StudentManagementSystem.java
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(roll, name, course));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.getRollNo() == roll) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.getRollNo() == roll) {
                students.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
