/* Program 8:
   In a college, a first-year class has the following attributes:
   - Name of the Class (BCA/B.Com/BSc)
   - Staff Name
   - Number of Students
   - Array of Students (Roll Number and Name)

   Write a Java program to accept and display the class details
   along with the details of all students.
*/

import java.util.Scanner;

// CollegeClass class
class CollegeClass {

    String className;
    String staffName;
    int noOfStudents;

    int[] rollNo;
    String[] studentName;

    // Constructor
    CollegeClass(String className, String staffName, int noOfStudents) {

        this.className = className;
        this.staffName = staffName;
        this.noOfStudents = noOfStudents;

        rollNo = new int[noOfStudents];
        studentName = new String[noOfStudents];
    }

    // Function to accept student details
    void acceptStudents(Scanner sc) {

        for (int i = 0; i < noOfStudents; i++) {

            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Enter Roll Number : ");
            rollNo[i] = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Student Name : ");
            studentName[i] = sc.nextLine();
        }
    }

    // Function to display class details
    void displayClassDetails() {

        System.out.println("\n========== CLASS DETAILS ==========");
        System.out.println("Class Name          : " + className);
        System.out.println("Staff Name          : " + staffName);
        System.out.println("Number of Students  : " + noOfStudents);

        System.out.println("\n---------- STUDENT DETAILS ----------");

        for (int i = 0; i < noOfStudents; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Roll Number : " + rollNo[i]);
            System.out.println("Name        : " + studentName[i]);
        }
    }
}

// Main class
public class FirstYearClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Class Name (BCA/B.Com/BSc) : ");
        String className = sc.nextLine();

        System.out.print("Enter Staff Name : ");
        String staffName = sc.nextLine();

        System.out.print("Enter Number of Students : ");
        int n = sc.nextInt();

        // Create object
        CollegeClass c = new CollegeClass(className, staffName, n);

        // Accept student details
        c.acceptStudents(sc);

        // Display details
        c.displayClassDetails();

        sc.close();
    }
}