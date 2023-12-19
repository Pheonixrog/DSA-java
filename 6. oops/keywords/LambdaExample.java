package keywords;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Sorting using a lambda expression
        Collections.sort(names, (String s1, String s2) -> s1.compareTo(s2));

        // Displaying the sorted list
        System.out.println(names);
    }

    // Traditional anonymous class
Runnable traditionalRunnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
};

// Lambda expression for the same Runnable
Runnable lambdaRunnable = () -> {
    System.out.println("Hello, World!");
};

}



