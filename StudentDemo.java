/* Program 7:
   Create a Student class with the following attributes:
   Enrollment No, Name, Marks of Subject1, Subject2, Subject3, Total Marks.

   The total marks should be calculated only if the student passes
   in all three subjects (minimum 50 marks in each subject).
   If the student fails in any one subject, total marks = 0.

   Write:
   1. Constructor
   2. Function to accept details
   3. Function to display details

   In the main method, create an array of three Student objects
   and display their details.
*/

import java.util.Scanner;

class Student {
    int enrollmentNo;
    String name;
    int sub1, sub2, sub3;
    int total;

    // Constructor
    Student(int enrollmentNo, String name, int sub1, int sub2, int sub3) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;

        // Calculate total only if student passes all subjects
        if (sub1 >= 50 && sub2 >= 50 && sub3 >= 50) {
            total = sub1 + sub2 + sub3;
        } else {
            total = 0;
        }
    }

    // Static function to accept student details
    static Student acceptDetails(Scanner sc) {

        System.out.print("Enter Enrollment No : ");
        int eno = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1 : ");
        int s1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2 : ");
        int s2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3 : ");
        int s3 = sc.nextInt();

        // Return Student object
        return new Student(eno, name, s1, s2, s3);
    }

    // Function to display details
    void displayDetails() {

        System.out.println("\n-----------------------------");
        System.out.println("Enrollment No : " + enrollmentNo);
        System.out.println("Name          : " + name);
        System.out.println("Subject 1     : " + sub1);
        System.out.println("Subject 2     : " + sub2);
        System.out.println("Subject 3     : " + sub3);

        if (total == 0)
            System.out.println("Result        : Fail");
        else
            System.out.println("Result        : Pass");

        System.out.println("Total Marks   : " + total);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 3 Student objects
        Student[] students = new Student[3];

        // Accept details of students
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));
            students[i] = Student.acceptDetails(sc);
        }

        // Display details of students
        System.out.println("\n===== STUDENT DETAILS =====");

        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }

        sc.close();
    }
}