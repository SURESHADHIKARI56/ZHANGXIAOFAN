/* Best Student Finder
name:suresh
date:25/07/2026
filename:BestStudent.java
*/
import java.util.Scanner;
// Student Class
class Student {
    String name;
    int regNo;
    int marks[] = new int[3];
    int total;

    // Constructor
    Student(String name, int regNo, int marks[]) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;

        total = 0;
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }
    }

    // Display Student Details
    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Register No  : " + regNo);
        System.out.println("Total Marks  : " + total);
    }
}

// FirstYear Class
class FirstYear {
    String className;
    String staffName;
    int noOfStudents;
    Student students[];

    // Constructor
    FirstYear(String className, String staffName, int noOfStudents) {
        this.className = className;
        this.staffName = staffName;
        this.noOfStudents = noOfStudents;
        students = new Student[noOfStudents];
    }

    // Find Best Student
    Student bestStudent() {
        Student best = students[0];

        for (int i = 1; i < noOfStudents; i++) {
            if (students[i].total > best.total) {
                best = students[i];
            }
        }

        return best;
    }
}

// Main Class
public class BestStudent{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read Class Details
        System.out.print("Enter Class Name (BCA/B.Com/B.Sc): ");
        String className = sc.nextLine();

        System.out.print("Enter Staff Name: ");
        String staffName = sc.nextLine();

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        // Create FirstYear Object
        FirstYear fy = new FirstYear(className, staffName, n);

        // Read Student Details
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Consume newline

            System.out.println("\nEnter Details of Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Register Number: ");
            int regNo = sc.nextInt();

            int marks[] = new int[3];

            System.out.println("Enter Marks of 3 Subjects:");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            fy.students[i] = new Student(name, regNo, marks);
        }

        // Find Best Student
        Student best = fy.bestStudent();

        // Display Result
        System.out.println("\n----- BEST STUDENT -----");
        System.out.println("Class Name : " + fy.className);
        System.out.println("Staff Name : " + fy.staffName);
        best.display();

        sc.close();
    }
}