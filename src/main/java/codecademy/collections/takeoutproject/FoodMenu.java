package codecademy.collections.takeoutproject;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    private List<Food> menu = new ArrayList<>();

    public FoodMenu() {
        menu.add(new Food("Spaghetti", "Bolognese", 6));
        menu.add(new Food("Burger", "tasty with cheese", 10));
        menu.add(new Food("Salad", "Caesar", 4));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < menu.size(); i++) {
            sb.append(i + 1).append(". ").append(menu.get(i).toString()).append("\n\n");
        }
        return sb.toString();
    }

    public Food getFood(int index) {
        int adjustedIndex = index-1;
        if (adjustedIndex >= 0 && adjustedIndex< menu.size()) {
            return menu.get(adjustedIndex);
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
