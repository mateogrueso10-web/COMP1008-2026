import java.util.ArrayList;
import java.util.Arrays;
 
public class Lab4 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = {
            // TODO: Fill in your grocery items
            "Milk", "Eggs", "Bread", "Apples", "Chicken", "Rice"
        };
 
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
        System.out.println("Grocery Array: " + Arrays.toString(groceries));
 
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
 
        // TODO: Loop through the array and add items to groceryList
        for (String item : groceries) {
            groceryList.add(item);
        }
        
 
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        groceryList.add("Bananas");
        groceryList.add("Yogurt");
        // Remove one item by name or index
        groceryList.remove("Eggs");
        // Print the updated ArrayList
        System.out.println("Updated Grocery List: " + groceryList);
        // ================================================
        
 
 
 
        // ================================================
        // STEP 5: Count how many items start with a vowel
        int vowelCount = 0;
        for (String item : groceryList) {
            // Check if the item starts with a vowel
            // Hint: vowels = a, e, i, o, u
            // Use .toLowerCase(). startsWith()
            char firstChar = Character.toLowerCase(item.charAt(0));     
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                vowelCount++;
            }
        }

        // ================================================
        
 
 
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        System.out.println("Number of items starting with a vowel: " + vowelCount);
        
 
    }
}