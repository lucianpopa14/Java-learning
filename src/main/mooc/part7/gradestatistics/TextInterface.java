package src.main.mooc.part7.gradestatistics;

import java.util.Scanner;

public class TextInterface {
    private Scanner scanner;
    private Points points;

    public TextInterface(Scanner scanner, Points points) {
        this.points = points;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int input = scanner.nextInt();
            if (input != -1) {
                points.addPoints(input);
            } else {
                System.out.println("Point average (all): " + points.calculateAverage());
                System.out.println("Point average (passing): "+points.calculatePassingAverage());}
                break;
            }
        }
    }
