package constructors;

class MyClass {
    // Instance variables
    private String name;
    private int age;

    // Default constructor
    public MyClass() {
        // Initialization code (if needed)
        this.name = "John Doe";
        this.age = 30;
    }

    // Parameterized constructor
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public MyClass(MyClass other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to get the age
    public int getAge() {
        return age;
    }

    // Other methods and code can go here
}

public class copy {
    public static void main(String[] args) {
        // Creating an instance of MyClass using the default constructor
        MyClass originalObject = new MyClass();

        // Using the copy constructor to create a new object with the same state
        MyClass copiedObject = new MyClass(originalObject);

        // Accessing data from the original and copied objects
        System.out.println("Original Object - Name: " + originalObject.getName() + ", Age: " + originalObject.getAge());
        System.out.println("Copied Object - Name: " + copiedObject.getName() + ", Age: " + copiedObject.getAge());
    }
    
}
