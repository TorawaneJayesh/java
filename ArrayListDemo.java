import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Add
        students.add("Rahul");
        students.add("Amit");
        students.add("Raj");

        System.out.println("Students: " + students);

        // Access
        System.out.println("First Student: " + students.get(0));

        // Update
        students.set(1, "Jayesh");

        System.out.println("After Update: " + students);

        // Remove
        students.remove("Raj");

        System.out.println("After Remove: " + students);

        // Size
        System.out.println("Size: " + students.size());

        // Contains
        System.out.println("Contains Jayesh: "
                           + students.contains("Jayesh"));
    }
}