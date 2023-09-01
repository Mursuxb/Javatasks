package Week2_2;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Add methods here
    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Removing " + item + " from the list");
        } else {
            System.out.println(item + " not on the list");
        }

    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public boolean checkItem(String item) {
        boolean check = groceryList.contains(item);
        System.out.printf("Is " + item + " in the grocery list? " + check + "\n");
        return check;
    }

    public static void main(String[] args) {
        GroceryListManager shoppingList = new GroceryListManager();
        shoppingList.addItem("Milk");
        shoppingList.addItem("Butter");
        shoppingList.addItem("Eggs");
        shoppingList.checkItem("Butter");
        shoppingList.removeItem("Butter");
        shoppingList.displayList();
    }
}
