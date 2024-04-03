package src.main.Collections.TakeoutProject;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBag<T extends PricedItem<Integer>> {
    private Map<T, Integer> shoppingBag;

    public ShoppingBag() {
        this.shoppingBag = new HashMap<>();
    }

    public void addItem(T item) {
        shoppingBag.merge(item, 1, Integer::sum);
    }


    public Integer getTotalPrice() {
        Integer grandTotal = 0;
        for (Map.Entry<T, Integer> entry : shoppingBag.entrySet()) {
            T item = entry.getKey();
            Integer quantity = entry.getValue();
            Integer price = item.getPrice();
            grandTotal += price.intValue() * quantity;
        }
        return grandTotal;
    }
}
