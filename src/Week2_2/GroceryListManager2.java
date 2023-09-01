package Week2_2;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager2 {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Add methods here
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println("Removing " + item + " from the list");
        } else {
            System.out.println(item + " not on the list");
        }

    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (HashMap.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            double cost = entry.getValue();
            System.out.println(item + "'s cost: " + cost);
        }
    }

    public boolean checkItem(String item) {
        boolean check = groceryList.containsKey(item);
        System.out.printf("Is " + item + " in the grocery list? " + check + "\n");
        return check;
    }

    public double calculateTotalCost() {
        double total = 0;
        for (HashMap.Entry<String, Double> entry : groceryList.entrySet()) {
            double cost = entry.getValue();
            total = total+cost;
        }
        System.out.println("Grocerylists total cost is: " + total);
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager2 shoppingList = new GroceryListManager2();
        shoppingList.addItem("Milk", 1.0);
        shoppingList.addItem("Butter", 2.5);
        shoppingList.addItem("Eggs", 3.2);
        shoppingList.addItem("Raisins", 10.8);
        shoppingList.checkItem("Butter");
        shoppingList.removeItem("Butter");
        shoppingList.displayList();
        shoppingList.calculateTotalCost();

    }
}
