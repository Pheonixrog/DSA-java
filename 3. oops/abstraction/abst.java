package abstraction;

// Abstract class example
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract void draw();

    // Concrete method
    void commonMethod() {
        System.out.println("This is a common method.");
    }
}

// Concrete class extending the abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
 
public class abst {
    public static void main(String[] args) {
        // Creating an instance of the concrete subclass
        Circle circle = new Circle();

        // Calling abstract and concrete methods
        circle.draw();          // Calls the draw() method specific to Circle
        circle.commonMethod();   // Calls the commonMethod() inherited from Shape
    }
    
}
