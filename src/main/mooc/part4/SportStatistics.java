package src.main.mooc.part4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("name of the file: ");
        String fileName = scanner.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner scanner1 = new Scanner(Paths.get("C:/Users/thinkpad/IdeaProjects/Java-learning/src/main/mooc/" + fileName))) {
            System.out.println("Insert the name of the team: ");
            Scanner scanner2 = new Scanner(System.in);
            String teamName = scanner2.nextLine();
            while (scanner1.hasNextLine()) {

                String[] parts = scanner1.nextLine().split(",");
                String team1 = parts[0].toLowerCase();
                String team2 = parts[1].toLowerCase();
                int score1 = Integer.parseInt(parts[2]);
                int score2 = Integer.parseInt(parts[3]);

                if (teamName.equals(team1)) {
                    games++;
                    if(score1>score2){
                        wins++;
                    }else {
                        losses++;
                    }
                }
                if (teamName.equals(team2)) {
                    games++;
                    if(score2>score1){
                        wins++;
                    }else {
                        losses++;
                    }
                }


            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
