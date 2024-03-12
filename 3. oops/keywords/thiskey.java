package keywords;

class Person {
    // Instance variables
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        // Using "this" to refer to instance variables when there is a naming conflict
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        // Using "this" to invoke the current object's methods
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }

    // Getter method for name
    public String getName() {
        return this.name;
    }

    // Getter method for age
    public int getAge() {
        return this.age;
    }

   public class thiskey{
     public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person("John", 25);

        // Calling the displayInfo method to print information
        person.displayInfo();
    }
   }
}

