package src.main.mooc.part4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get("C:/Users/thinkpad/IdeaProjects/Java-learning/src/main/mooc/" + fileName))) {
            String teamName = scanner1.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
