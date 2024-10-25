package src.main.mooc.part9.OnlineShop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        for (Item item : cart) {
            if (item.getProduct().equals(product)) {
                item.increaseQuantity();
                return;
            }
        }
        cart.add(new Item(product, 1, price));

    }

    public int price() {
        int price = 0;
        for (Item item : cart) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : cart) {
            System.out.println(item.getProduct() + ": " + item.getQty());
        }
    }
}
