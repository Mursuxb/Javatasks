package Week2_2;

import java.util.HashMap;
import java.util.Objects;

public class GroceryListManager4 {
    private HashMap<String, Integer> groceryList = new HashMap<>();

    // Add methods here
    public void addItemWithQuantity(String item, int quantity) {
        groceryList.put(item, quantity);
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removing " + item + " from the list");
        } else {
            System.out.println(item + " not on the list");
        }

    }

    public void displayAvailableItems() {
        System.out.println("Items on the grocerylist: ");
        for (HashMap.Entry<String, Integer> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (quantity > 0) {
                System.out.println(item + " " + quantity);
            }
        }
    }

    public boolean checkItem(String item) {
        boolean check = groceryList.containsKey(item);
        System.out.printf("Is " + item + " in the grocery list? " + check + "\n");
        return check;
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            groceryList.replace(item, newQuantity);
            System.out.println(item + "s quantity has been updated to "+ newQuantity);
        } else {
            System.out.println(item + " not on list");
        }
    }

    public static void main(String[] args) {
        GroceryListManager4 shoppingList = new GroceryListManager4();
        shoppingList.addItemWithQuantity("Milk", 1);
        shoppingList.addItemWithQuantity("Butter", 1);
        shoppingList.addItemWithQuantity("Eggs", 6);
        shoppingList.addItemWithQuantity("Raisins", 2);
        shoppingList.addItemWithQuantity("Chocolate", -6);
        shoppingList.updateQuantity("Raisins", 1);
        shoppingList.checkItem("Butter");
        shoppingList.removeItem("Milk");
        shoppingList.updateQuantity("Milk", 1);
        shoppingList.displayAvailableItems();
    }
}
