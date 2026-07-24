/*Program to Arrange Employees According to Seniority Using Appointment Date
name:suresh
date:25/07/2026
filename:EmployeeSeniority.java
*/
import java.util.Scanner;

// Employee class
class Employee {
    String name;
    String appointmentDate;

    // Method to read employee details
    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        appointmentDate = sc.nextLine();
    }

    // Method to display employee details
    void display() {
        System.out.println(name + "\t\t" + appointmentDate);
    }
}

// Main class
public class EmployeeSeniority {

    public static void main(String[] args) {

        Employee[] emp = new Employee[10];

        // Read details of 10 employees
        for (int i = 0; i < emp.length; i++) {
            System.out.println("\nEnter Details of Employee " + (i + 1));

            emp[i] = new Employee();
            emp[i].read();
        }

        // Bubble Sort based on Appointment Date
        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = 0; j < emp.length - 1 - i; j++) {

                if (emp[j].appointmentDate.compareTo(emp[j + 1].appointmentDate) > 0) {

                    Employee temp = emp[j];
                    emp[j] = emp[j + 1];
                    emp[j + 1] = temp;
                }
            }
        }

        // Display employees according to seniority
        System.out.println("\nEmployees Sorted by Seniority");
        System.out.println("------------------------------------------");
        System.out.printf("%-20s %-15s\n", "Employee Name", "Appointment Date");
        System.out.println("------------------------------------------");

        for (int i = 0; i < emp.length; i++) {
            emp[i].display();
        }
    }
}