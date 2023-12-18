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


public class defconc{

    public static void main(String[] args) {
        // Creating an instance of MyClass using the default constructor
        MyClass myObject = new MyClass();

        // Accessing instance variables and methods
        String name = myObject.getName();
        int age = myObject.getAge();

        // Visualizing the data
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}
