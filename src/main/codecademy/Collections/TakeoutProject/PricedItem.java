package src.main.codecademy.Collections.TakeoutProject;

public interface PricedItem<T extends Number> {
    T getPrice();
    void setPrice(T price);
}
