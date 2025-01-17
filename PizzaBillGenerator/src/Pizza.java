import java.util.Scanner;

public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int backPack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraTopping() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsAdded;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPack;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + extraToppingsAdded + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take Away: " + backPack + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }}