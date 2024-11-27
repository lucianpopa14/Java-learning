package mooc.part3;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String nameOfTheOldest = "";
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            if (input.isEmpty()) {
                break;
            }

            if (Integer.parseInt(pieces[1]) > maxAge) {
                maxAge = Integer.parseInt(pieces[1]);
                nameOfTheOldest = pieces[0];
            }

        }
        System.out.println("The age of the oldest is: " + maxAge);
        System.out.println("The name of the oldest is: "+ nameOfTheOldest);
    }
}
