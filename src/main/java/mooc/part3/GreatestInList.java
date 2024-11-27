package mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
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
        int maxNumber = numbers.get(0);
        for(Integer number:numbers){
            if(number>maxNumber){
                maxNumber = number;
            }
        }
        System.out.println("The biggest number is: "+maxNumber);
    }
}
