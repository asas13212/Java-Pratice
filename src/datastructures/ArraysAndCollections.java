import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndCollections {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = {5, 3, 8, 1, 9, 2, 7, 4, 6};
        System.out.println("Array: " + Arrays.toString(numbers));

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);

        // Sorting an array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D array:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("ArrayList: " + fruits);
        System.out.println("Size: " + fruits.size());

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Iterate with enhanced for loop
        System.out.print("Fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Check if element exists
        System.out.println("Contains Cherry: " + fruits.contains("Cherry"));
    }
}
