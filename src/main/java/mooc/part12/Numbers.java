package mooc.part12;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void randomGenerator(int howMany) {
        Random generator = new Random();
        int counter=0;
        while (counter<howMany){
            System.out.println(generator.nextInt(0, 10));
            counter++;
        }
    }

    public static void main(String[] args) {
        System.out.println("How many random numbers should be printed?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        randomGenerator(Integer.parseInt(input));
    }
}
