package polymorphism;

// Example demonstrating both compile-time and runtime polymorphism

// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Derived class 1
class Dog extends Animal {
    // Method overloading (compile-time polymorphism)
    void makeSound(String sound) {
        System.out.println("Dog barks: " + sound);
    }

    // Method overriding (runtime polymorphism)
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    // Method overriding (runtime polymorphism)
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class poly {
    public static void main(String[] args) {
        // Compile-time polymorphism (method overloading)
        Dog myDog = new Dog();
        myDog.makeSound();          // Calls overridden method in Dog class
        myDog.makeSound("Woof");    // Calls overloaded method in Dog class

        // Runtime polymorphism (method overriding)
        Animal myAnimal = new Dog(); // Reference of base class, object of derived class
        myAnimal.makeSound();        // Calls overridden method in Dog class

        // Another example of runtime polymorphism
        myAnimal = new Cat();        // Reference of base class, object of another derived class
        myAnimal.makeSound();        // Calls overridden method in Cat class
    }
}

