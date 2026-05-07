import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> scores = new HashMap<>();

        // Add key-value pairs
        scores.put("Alice", 95);
        scores.put("Bob", 82);
        scores.put("Charlie", 90);
        scores.put("Diana", 88);

        System.out.println("Scores: " + scores);
        System.out.println("Size: " + scores.size());

        // Access a value
        System.out.println("Alice's score: " + scores.get("Alice"));

        // Check if key exists
        System.out.println("Contains Bob: " + scores.containsKey("Bob"));

        // Update a value
        scores.put("Bob", 87);
        System.out.println("Bob's updated score: " + scores.get("Bob"));

        // Remove a key
        scores.remove("Diana");
        System.out.println("After removing Diana: " + scores);

        // Iterate over entries
        System.out.println("All scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }

        // Default value when key not found
        int eveScore = scores.getOrDefault("Eve", 0);
        System.out.println("Eve's score (default 0): " + eveScore);
    }
}
