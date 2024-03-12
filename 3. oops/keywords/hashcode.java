package keywords;

import java.util.Objects;

public class hashcode {
    private String name;
    private int age;

    public hashcode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Other methods and getters...

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        hashcode person = (hashcode) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        hashcode person1 = new hashcode("Alice", 25);
        hashcode person2 = new hashcode("Alice", 25);

        // Displaying equality and hash codes
        System.out.println("Equality: " + person1.equals(person2));
        System.out.println("Hash code for person1: " + person1.hashCode());
        System.out.println("Hash code for person2: " + person2.hashCode());
    }
}

