package codecademy.collections.takeoutproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String customerName = input.nextLine();
        int money = 0;
        boolean validInput = false;
        while(!validInput){
            System.out.println("Enter the amount of money (€) you have: ");
            if(input.hasNextInt()){
                money = input.nextInt();
                validInput = true;
            }else {
                System.out.println("Invalid input. Please enter an integer amount.");
                input.next();
            }
        }
        Customer customer = new Customer(customerName, money);
        FoodMenu menu = new FoodMenu();
        TakeOutSimulator takeOutSimulator = new TakeOutSimulator(customer, menu);
        takeOutSimulator.startTakeOutSimulator();
    }
}
