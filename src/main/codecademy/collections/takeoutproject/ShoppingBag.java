package src.main.codecademy.collections.takeoutproject;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBag<T extends PricedItem<Integer>> {
    private Map<T, Integer> shoppingBag;

    public ShoppingBag() {
        shoppingBag = new HashMap<>();
    }

    public void addItem(T item) {
        shoppingBag.merge(item, 1, Integer::sum);
    }


    public Integer getTotalPrice() {
        int total = 0;
        for (Map.Entry<T, Integer> entry : shoppingBag.entrySet()) {
            T item = entry.getKey();
            Integer quantity = entry.getValue();
            total += item.getPrice() * quantity;
        }
        return total;
    }
}
