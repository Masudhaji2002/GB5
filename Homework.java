import java.util.*;

public class Homework {
    public static void main(final String[] args) {
        
        HashMap<String, Integer> phoneBook = new HashMap<>();

        
        phoneBook.put("Ivan Ivanov", 123456);
        phoneBook.put("Petar Petrov", 654321);
        phoneBook.put("Maria Ivanova", 111111);
        phoneBook.put("Ivan Petrov", 222222);
        phoneBook.put("Petar Ivanov", 333333);

        
        HashMap<String, Integer> nameCount = new HashMap<>();

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            String[] nameParts = entry.getKey().split(" ");
            String firstName = nameParts[0];

            if (nameCount.containsKey(firstName)) {
                nameCount.put(firstName, nameCount.get(firstName) + 1);
            } else {
                nameCount.put(firstName, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedNameCount = new ArrayList<>(nameCount.entrySet());
        sortedNameCount.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : sortedNameCount) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

