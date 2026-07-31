/**
Program to demonstrate Method Overriding using
a real-time Online Payment System.
Date:01/08/2026
Name : Suresh Adhikari
Filename: PaymentSystem.java
 */

// Parent Class
class Payment {
    void pay() {
        System.out.println("Processing Payment...");
    }
}

// Child Class 1
class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

// Child Class 2
class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using UPI.");
    }
}

// Child Class 3
class Cash extends Payment {
    @Override
    void pay() {
        System.out.println("Payment will be made through Cash.");
    }
}

// Main Class
public class PaymentSystem {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

        p = new Cash();
        p.pay();
    }
}