package mooc.part9.OnlineShop;

import java.util.Scanner;

public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            if (warehouse.take(product)){
                cart.add(product, warehouse.price(product));
                System.out.println(product+" was added to cart!");
            }else {
                System.out.println("the product does not exist");
            }
        }

        System.out.println("your shopping cart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
