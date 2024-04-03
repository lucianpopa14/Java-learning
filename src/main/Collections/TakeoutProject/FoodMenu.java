package src.main.Collections.TakeoutProject;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    private List<Food> menu = new ArrayList<>();

    public FoodMenu() {
        menu.add(new Food("Spaghetti", "Bolognese", 6));
        menu.add(new Food("Burger", "tasty with cheese", 7));
        menu.add(new Food("Salad", "Caesar", 4));
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < menu.size(); i++) {
            Food item = menu.get(i);
            result += (i + 1) + ". " + item.getName() + " " + item.getDescription() + " €" + item.getPrice() + "\n";
        }
        return result;
    }

    public Food getFood(int index) {
        if (index > 0 && index<= menu.size()) {
            return menu.get(index-1);
        } else {
            return null;
        }

    }
    public Food getLowestCostFood(){
        if (menu.isEmpty()) {
            System.out.println("The menu is empty!");
        }
        Food lowestCostFood = menu.get(0);
        for (Food item:menu){
            if(item.getPrice()< lowestCostFood.getPrice()){
                lowestCostFood = item;
            }
        }
        return lowestCostFood;
    }
}
