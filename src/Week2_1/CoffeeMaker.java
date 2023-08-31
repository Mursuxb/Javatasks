package Week2_1;

import java.util.Objects;

public class CoffeeMaker {
    private String coffeeType;
    private boolean on;
    private int amount;

    public void setCoffeeType(String coffeeType) {
        if (Objects.equals(coffeeType, "normal") || Objects.equals(coffeeType, "espresso")) {
            this.coffeeType = coffeeType;
        } else {
            this.coffeeType = "normal";
        }
    }

    public void setOnOff() {
        this.on = !this.on;
    }

    public void setAmount(int amount) {
        if (amount > 80) {
            amount = 80;
        } else if (amount < 10) {
            amount = 10;
        }
        this.amount = amount;
    }

    public void makeCoffee() {
        if (!this.on) {
            System.out.println("Coffee maker is OFF");
        } else {
            System.out.println("Making " + this.coffeeType + " coffee " + this.amount + " ml");
        }
    }

    public static void main(String[] args) {
        CoffeeMaker pena = new CoffeeMaker();
        pena.setCoffeeType("normal");
        pena.setAmount(80);
        pena.makeCoffee();
        pena.setOnOff();
        pena.setAmount(120);
        pena.makeCoffee();

    }
}
