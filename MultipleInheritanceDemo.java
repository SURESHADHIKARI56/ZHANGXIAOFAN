/* Write a Java program to demonstrate Multiple Inheritance using Interfaces.
   Create an interface Circle with a method draw().
   Create another interface Rectangle with a method draw().
   Create a class Shape that implements both interfaces.
   In the main() method, create an object of Shape and call the draw() method.
*/

// Interface 1
interface Circle {
    void draw();
}

// Interface 2
interface Rectangle {
    void draw();
}

// Class implementing both interfaces
class Shape implements Circle, Rectangle {

    public void draw() {
        System.out.println("Drawing Circle and Rectangle");
    }
}

// Main class
public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        Shape s = new Shape();
        s.draw();

    }
}