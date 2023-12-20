package keywords;

// Example demonstrating the use of the final keyword

// Final variable (constant)
class MathConstants {
    final double PI = 3.141592653589793;
    final int MAX_VALUE = 100;
}

// Final method
class Parent {
    final void display() {
        System.out.println("This is a final method in the Parent class.");
    }
}

// Attempt to override a final method (will result in a compilation error)
class Child extends Parent {
    // Uncommenting the next line will result in a compilation error
    // void display() { }
}

// Final class (cannot be extended)
final class FinalClass {
    // Class members...
}

// Attempt to extend a final class (will result in a compilation error)
// class AnotherClass extends FinalClass { }

