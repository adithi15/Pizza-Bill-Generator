import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which pizza would you like to have? (veg/non-veg): ");
        String pizzaType = scanner.next().toLowerCase();
        boolean isVeg = pizzaType.equals("veg");

        Pizza basePizza = new Pizza(isVeg);

        System.out.print("Do you want extra cheese? (yes/no): ");
        String extraCheese = scanner.next();
        if (extraCheese.equalsIgnoreCase("yes")) {
            basePizza.addExtraCheese();
        }

        System.out.print("Do you want extra toppings? (yes/no): ");
        String extraToppings = scanner.next();
        if (extraToppings.equalsIgnoreCase("yes")) {
            basePizza.addExtraTopping();
        }

        System.out.print("Do you want takeaway? (yes/no): ");
        String takeaway = scanner.next();
        if (takeaway.equalsIgnoreCase("yes")) {
            basePizza.takeAway();
        }

        basePizza.getBill();
    }
}
