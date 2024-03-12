package interfacees;

// Interface definition
interface Printable {
    // Abstract method (implicitly public and abstract)
    void print();

    // Constant field (implicitly public, static, and final)
    String MESSAGE = "This is a printable object.";

    // Default method with a body (introduced in Java 8)
    default void display() {
        System.out.println("Displaying: " + MESSAGE);
    }

    // Static method (introduced in Java 8)
    static void welcome() {
        System.out.println("Welcome to the Printable world!");
    }
}

// Class implementing the interface
class Printer implements Printable {
    // Implementation of the abstract method in the interface
    @Override
    public void print() {
        System.out.println("Printing: " + MESSAGE);
    }

    // The display method is inherited from the interface but can be overridden
    @Override
    public void display() {
        System.out.println("Custom display implementation");
    }
}

public class interFace {
    public static void main(String[] args) {
        // Creating an instance of the class that implements the interface
        Printable printer = new Printer();

        // Calling methods defined in the interface and the implementing class
        printer.print();
        printer.display();

        // Calling a static method of the interface
        Printable.welcome();
    }
}

