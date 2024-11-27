package mooc.part3;

import java.util.Scanner;

public class ItIsTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a string: ");
        String input = scanner.nextLine();
        if(input.equals("true")){
            System.out.println("You got it right!");
        }
        else {
            System.out.println("Try again!");
        }
    }
}
