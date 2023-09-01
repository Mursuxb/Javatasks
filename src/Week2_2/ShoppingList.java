package Week2_2;

import java.util.HashMap;

public class ShoppingList {

    private HashMap<String, Integer> ShoppingList = new HashMap<>();
    private String name = "Shoppinglist";

    public ShoppingList(String name) {
        this.name = name;
    }


    public void addItemWithQuantity(String item, int quantity) {
        System.out.println("Adding " + quantity + " " + item + " to the " + this.name);
        ShoppingList.put(item, quantity);
    }

    public void removeItem(String item) {
        if (ShoppingList.containsKey(item)) {
            ShoppingList.remove(item);
            System.out.println("Removing " + item + " from the " + this.name);
        } else {
            System.out.println(item + " not on the list");
        }

    }

    public void displayAvailableItems() {
        System.out.println("Items on the " + this.name + ": ");
        for (HashMap.Entry<String, Integer> entry : ShoppingList.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (quantity > 0) {
                System.out.println(item + " " + quantity);
            }
        }
    }
}
