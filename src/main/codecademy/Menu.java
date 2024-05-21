package src.main.codecademy;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;
    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal) {
        if(!meals.contains(meal)){
            meals.add(meal);
        }
    }
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        meals.clear();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
