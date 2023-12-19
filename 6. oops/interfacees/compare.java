package interfacees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Compare based on age
        return Integer.compare(this.age, otherStudent.age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 18));
        studentList.add(new Student("Charlie", 22));

        // Sorting the list using Collections.sort
        Collections.sort(studentList);

        // Displaying the sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}




