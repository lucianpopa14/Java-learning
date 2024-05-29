package src.main.mooc.part3;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert strings. Program ends with an empty insert.");
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
            if (input.isEmpty()) {
                break;
            }
        }
    }
}
