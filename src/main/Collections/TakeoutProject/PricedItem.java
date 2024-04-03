package src.main.Collections.TakeoutProject;

public interface PricedItem<T extends Number> {
    T getPrice();
    T setPrice(T price);
}
