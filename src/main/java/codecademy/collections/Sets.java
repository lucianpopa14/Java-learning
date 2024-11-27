package codecademy.collections;

import java.util.TreeSet;
import java.util.Set;

public class Sets{
    public static void main(String[] args) {
        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(3);
        sortedSet.add(7);
        sortedSet.add(27);
        sortedSet.add(7);

        for (Integer element:sortedSet){
            System.out.println(element);
        }
    }
}