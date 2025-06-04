import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 3. Accessing Elements
        System.out.println("Element at index 1: " + fruits.get(1));  // Banana

        // 4. Updating Elements
        fruits.set(1, "Blueberry");  // Replaces Banana with Blueberry
        System.out.println("After update: " + fruits);

        // 5. Removing Elements
        fruits.remove(2);  // Removes Cherry
        System.out.println("After removal: " + fruits);

        // 6. Checking Size
        System.out.println("Size of list: " + fruits.size());

        // 7. Checking if List Contains an Element
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // 8. Iterating Over Elements
        System.out.println("All elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. Sorting the List
        fruits.add("Mango");
        fruits.add("Avocado");
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // 10. Clearing the List
        fruits.clear();
        System.out.println("List after clear: " + fruits);

        // 11. Checking if List is Empty
        System.out.println("Is list empty? " + fruits.isEmpty());
    }
}
