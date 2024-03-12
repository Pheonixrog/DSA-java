package keywords;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    // Method that accepts a list of any type
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Banana");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Using the unbounded wildcard to print lists of any type
        printList(stringList);
        printList(integerList);
    }
}



class UpperBoundedWildcard {
    // Method that accepts a list of any type that is a subtype of Number
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}


 class LowerBoundedWildcard {
    // Method that accepts a list of any type that is a supertype of Integer
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}


