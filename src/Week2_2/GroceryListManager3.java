package Week2_2;

import java.util.HashMap;
import java.util.Objects;

public class GroceryListManager3 {
    private HashMap<String, String> groceryList = new HashMap<>();

    // Add methods here
    public void addItem(String item, String category) {
        groceryList.put(item, category);
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removing " + item + " from the list");
        } else {
            System.out.println(item + " not on the list");
        }

    }

    public void displayByCategory(String category) {
        System.out.println(category + " items on the grocerylist: ");
        for (HashMap.Entry<String, String> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            String cat = entry.getValue();
            if (Objects.equals(cat, category)){
                System.out.println(item);
            }
        }
    }

    public boolean checkItem(String item) {
        boolean check = groceryList.containsKey(item);
        System.out.printf("Is " + item + " in the grocery list? " + check + "\n");
        return check;
    }

    public static void main(String[] args) {
        GroceryListManager3 shoppingList = new GroceryListManager3();
        shoppingList.addItem("Milk", "Dairy");
        shoppingList.addItem("Butter", "Dairy");
        shoppingList.addItem("Eggs", "Baking");
        shoppingList.addItem("Raisins", "Snacky");
        shoppingList.checkItem("Butter");
        shoppingList.removeItem("Eggs");
        shoppingList.displayByCategory("Dairy");
    }
}
