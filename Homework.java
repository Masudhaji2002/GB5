import java.util.*;

public class Homework {
    public static void main(final String[] args) {
        // Create a HashMap to store the phone book data
        HashMap<String, Integer> phoneBook = new HashMap<>();

        // Add employees and their phone numbers to the phone book
        phoneBook.put("Ivan Ivanov", 123456);
        phoneBook.put("Petar Petrov", 654321);
        phoneBook.put("Maria Ivanova", 111111);
        phoneBook.put("Ivan Petrov", 222222);
        phoneBook.put("Petar Ivanov", 333333);

        // Create a HashMap to store the count of names
        HashMap<String, Integer> nameCount = new HashMap<>();

        // Iterate over the phone book entries
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            // Split the name into first and last name
            String[] nameParts = entry.getKey().split(" ");
            String firstName = nameParts[0];

            // Update the count of names
            if (nameCount.containsKey(firstName)) {
                nameCount.put(firstName, nameCount.get(firstName) + 1);
            } else {
                nameCount.put(firstName, 1);
            }
        }

        // Sort the name count map by value in descending order
        List<Map.Entry<String, Integer>> sortedNameCount = new ArrayList<>(nameCount.entrySet());
        sortedNameCount.sort((a, b) -> b.getValue() - a.getValue());

        // Print the sorted name count
        for (Map.Entry<String, Integer> entry : sortedNameCount) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

