package mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
        System.out.println("Search for? ");
        int searched = Integer.parseInt(scanner.nextLine());
        for(int i=0; i< numbers.size();i++){
            if(numbers.get(i)==searched) {
                System.out.println(searched + " is at index " + (numbers.get(i) -1));
            }
        }
    }
}
