/* Write a Java program to demonstrate Single Inheritance, Multilevel Inheritance, and Hierarchical Inheritance in one application. */

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single Inheritance (Animal -> Dog)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance (Animal -> Dog -> Puppy)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Hierarchical Inheritance (Animal -> Cat)
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("Multilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("Hierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}