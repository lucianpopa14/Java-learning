package src.main.codecademy.collections;
import java.util.List;
import java.util.ArrayList;
public class Lists {
    public static void main(String[] args) {
        List <String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
        for (String element : stringList){
            System.out.println(element);
        }
    }
}