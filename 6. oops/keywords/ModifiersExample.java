package keywords;

public class ModifiersExample {

    // Public field accessible from anywhere
    public static int publicField = 10;

    // Private field accessible only within the class
    private int privateField = 20;

    // Protected field accessible within the same package and by subclasses
    protected int protectedField = 30;

    // Package-private (default) field accessible within the same package
    int packagePrivateField = 40;

    // Final variable cannot be modified
    public final String finalVariable = "This is final";

    // Static variable belongs to the class rather than an instance
    public static String staticVariable = "This is static";

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Private method accessible only within the class
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method accessible within the same package and by subclasses
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Package-private (default) method accessible within the same package
    void packagePrivateMethod() {
        System.out.println("Package-private method");
    }

    // Static method belongs to the class rather than an instance
    public static void staticMethod() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        // Accessing fields and methods from the main method
        ModifiersExample example = new ModifiersExample();

        System.out.println("Public field: " + ModifiersExample.publicField);
        System.out.println("Private field: " + example.privateField);
        System.out.println("Protected field: " + example.protectedField);
        System.out.println("Package-private field: " + example.packagePrivateField);

        System.out.println("Final variable: " + example.finalVariable);
        System.out.println("Static variable: " + ModifiersExample.staticVariable);

        example.publicMethod();
        example.privateMethod();
        example.protectedMethod();
        example.packagePrivateMethod();
        ModifiersExample.staticMethod();
    }
}
