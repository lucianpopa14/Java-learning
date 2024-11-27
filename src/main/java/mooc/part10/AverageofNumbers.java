package mooc.part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageofNumbers {
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
        double average = list.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
