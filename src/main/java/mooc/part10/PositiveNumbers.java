package mooc.part10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positives = numbers.stream()
                .filter(value -> value >0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positives;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(3);
        list.add(10);
        list.add(-14);
        list.add(-28);
        list.add(6);
        list.add(35);

        System.out.println(positive(list));
    }

}
