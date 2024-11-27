package mooc.part4;


import org.apache.commons.lang3.StringUtils;

public class Product {
    private double price;
    private int  quantity;
    private String name;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct(){
        System.out.println(StringUtils.capitalize(name) +", price "+price+", "+quantity+" pcs");
    }
}