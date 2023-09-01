package Week2_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager5 {
    public static void main(String[] args) {
        ShoppingList BBQ = new ShoppingList("BBQList");
        ShoppingList kids = new ShoppingList("KidsList");
        BBQ.addItemWithQuantity("Chicken", 1);
        BBQ.addItemWithQuantity("Beer", 6);
        BBQ.addItemWithQuantity("Burgers", 4);
        kids.addItemWithQuantity("HotDog", 2);
        kids.addItemWithQuantity("Soda", 4);
        BBQ.addItemWithQuantity("Mayo",1);
        BBQ.displayAvailableItems();
        kids.displayAvailableItems();
        BBQ.removeItem("Mayo");
        BBQ.displayAvailableItems();
    }
}
