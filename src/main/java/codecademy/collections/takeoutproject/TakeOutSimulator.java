package codecademy.collections.takeoutproject;

import java.util.Scanner;

public class TakeOutSimulator {
    private Customer customer;
    private FoodMenu menu;
    private Scanner input;

    public TakeOutSimulator(Customer customer, FoodMenu menu) {
        this.customer = customer;
        this.menu = menu;
        this.input = new Scanner(System.in);
    }


    private <T> T getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever<T> intUserInputRetriever) {
        while (true) {
            System.out.println(userInputPrompt);
            try {
                if (input.hasNextInt()) {
                    int selection = input.nextInt();
                    return intUserInputRetriever.produceOutputOnUserInput(selection);
                } else {
                    input.next();
                    System.out.println("Please enter an integer value.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("The input was not valid. Please try again.");
            }
        }
    }

    public boolean shouldSimulate() {
        String userPrompt = "Enter 1 to continue simulation or 0 to exit the program: ";
        IntUserInputRetriever<Boolean> intUserInputRetriever = selection -> {
            if (selection == 1) {
                return customer.getMoney() >= menu.getLowestCostFood().getPrice();
            } else if (selection == 0) {
                return false;
            } else {
                throw new IllegalArgumentException("You don't have enough money to continue simulation.");
            }
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public Food getMenuSelection() {
        String userPrompt = "Today's menu options:";
        System.out.println(userPrompt);
        System.out.println(menu.toString());
        System.out.println("Choose a menu item by inserting the number on the list: ");
        IntUserInputRetriever<Food> intUserInputRetriever = selection -> {
            Food selectedFood = menu.getFood(selection);
            if (selectedFood != null) {
                return selectedFood;
            } else {
                throw new IllegalArgumentException("The selected item number is not in range.");
            }
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public Boolean isStillOrderingFood() {
        String userPrompt = "Enter 1 to continue shopping or 0 to checkout: ";
        IntUserInputRetriever<Boolean> intUserInputRetriever = selection -> {
            if (selection == 1) {
                return true;
            } else if (selection == 0) {
                return false;
            } else throw new IllegalArgumentException("Invalid input. Please try again. Inset 1 or 0.");
        };
        return getOutputOnIntInput(userPrompt, intUserInputRetriever);
    }

    public void checkoutCustomer(ShoppingBag<Food> shoppingBag) {
        System.out.println("Processing payment. Please wait...");
        int remainingMoney = customer.getMoney() - shoppingBag.getTotalPrice();
        customer.setMoney(remainingMoney);
        System.out.println("Your remaining money is: " + remainingMoney);
        System.out.println("Enjoy your food!");
    }

    public void takeOutPrompt() {
        ShoppingBag<Food> shoppingBag = new ShoppingBag<>();
        int customerMoneyLeft = customer.getMoney();
        while (true) {
            System.out.println("You have " + customerMoneyLeft + "Є" + " to spend.");
            Food selectedFood = getMenuSelection();
            if (selectedFood != null && customerMoneyLeft >= selectedFood.getPrice()) {
                customerMoneyLeft -= selectedFood.getPrice();
                shoppingBag.addItem(selectedFood);
            } else {
                System.out.println("Unfortunately you don't have enough money for this item. Please choose another item.");
            }
            if (!isStillOrderingFood()) {
                break;
            }
        }
        checkoutCustomer(shoppingBag);
    }

    public void startTakeOutSimulator() {

        while (shouldSimulate()) {
            System.out.println("Hello and welcome to our Java-based restaurant!");
            takeOutPrompt();
        }
    }
}