package mooc.part7.gradestatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        TextInterface textInterface = new TextInterface(scanner, points);

        textInterface.start();

    }
}
