/**
 * Program: Single Inheritance Demo
 * Name: Suresh Adhikari
Date: 01-08-2026
filename: SingleInheritance.java
 */

class AddSub {
    int a = 10, b = 20;

    // Method to perform addition
    void add() {
        int total = a + b;
        System.out.println("Addition = " + total);
    }

    // Method to perform subtraction
    void subtract() {
        int sub = b - a;
        System.out.println("Subtraction = " + sub);
    }
}

// Child class inheriting the parent class
class MulDiv extends AddSub {

    // Method to perform multiplication
    void multiply() {
        int mul = a * b;
        System.out.println("Multiplication = " + mul);
    }

    // Method to perform division
    void divide() {
        float div = (float) b / a;
        System.out.println("Division = " + div);
    }
}

// Main class
public class SingleInheritance {

    public static void main(String[] args) {

        // Creating object of child class
        MulDiv obj = new MulDiv();

        // Calling inherited methods
        obj.add();
        obj.subtract();

        // Calling child class methods
        obj.multiply();
        obj.divide();
    }
}