package mooc.part3;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a word: ");
        String input = scanner.nextLine();
        System.out.print(input);
        System.out.print(input);
        System.out.print(input);
    }
}
