package keywords;


// Parent class (superclass)
class Animal {
    // Instance variable
    String name;

    // Parameterized constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to display information about the animal
    public void displayInfo() {
        System.out.println("Animal: " + name);
    }
}

// Child class (subclass) extending the Animal class
class Dog extends Animal {
    // Additional instance variable
    String breed;

    // Parameterized constructor
    public Dog(String name, String breed) {
        // Calling the constructor of the immediate parent class using "super"
        super(name);
        this.breed = breed;
    }

    // Overriding the displayInfo method of the parent class
    @Override
    public void displayInfo() {
        // Using "super" to call the displayInfo method of the parent class
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

public class superkey {
    public static void main(String[] args) {
        // Creating an instance of the child class
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Calling the displayInfo method of the child class
        myDog.displayInfo();
    }
}
