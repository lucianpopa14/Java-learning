package mooc.part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageofSomeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Input numbers, type end to stop:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                list.add(input);
            }
        }
        double averageOfPositives = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        double averageOfNegatives = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p):");
        String posOrNeg = scanner.nextLine();

        if (posOrNeg.toLowerCase().equals("n")) {
            System.out.println("Average of the negative numbers: " + averageOfNegatives);
        }
        if (posOrNeg.toLowerCase().equals("p")) {
            System.out.println("Average of the positive numbers: " + averageOfPositives);
        }
    }
}
