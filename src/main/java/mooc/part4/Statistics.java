package mooc.part4;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (double) sum / count;
    }

    public int getCount() {
        return count;
    }
//i know main here is not ideal but it's easier to keep track in the package
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert numbers; insert stops when -1: ");
        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + statistics2.sum());
                System.out.println("Sum of odd numbers: " + statistics3.sum());
                break;
            } else {
                if (userInput%2==0){
                    statistics2.addNumber(userInput);
                } else {
                    statistics3.addNumber(userInput);
                }
                statistics.addNumber(userInput);
            }
        }

    }
}
