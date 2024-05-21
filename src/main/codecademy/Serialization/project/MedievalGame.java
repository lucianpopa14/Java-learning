package src.main.codecademy.Serialization.project;

import java.io.*;
import java.util.Scanner;

public class MedievalGame {

    /* Instance Variables */
    private Player player;

//    this is the main method
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        MedievalGame game = new MedievalGame();

        game.player = game.start(console);

        game.addDelay(500);
        System.out.println("\nLet's take a quick look at you to make sure you're ready to head out the door.");
        System.out.println(game.player);

        game.addDelay(1000);
        System.out.println("\nWell, you're off to a good start, let's get your game saved so we don't lose it.");
        game.save();

        game.addDelay(2000);
        System.out.println("We just saved your game...");
        System.out.println("Now we are going to try to load your character to make sure the save worked...");

        game.addDelay(1000);
        System.out.println("Deleting character...");
        String charName = game.player.getName();
        game.player = null;

        game.addDelay(1500);
        game.player = game.load(charName, console);
        System.out.println("Loading character...");

        game.addDelay(2000);
        System.out.println("Now let's print out your character again to make sure everything loaded:");

        game.addDelay(500);
        System.out.println(game.player);
    } // End of main

    /* Instance Methods */
    private Player start(Scanner console) {
        // Add start functionality here
        Player player;
        Art.homeScreen();
        System.out.println("Welcome to the game!");
        System.out.println("Enter 'y' to load a game or 'n' to create a new game: ");
        String answer = console.next().toLowerCase();
        while (true) {
            if (answer.equals("y")) {
                System.out.println("Enter the previous character name that you used:");
                player = load(console.next(), console);
                break;
            } else if (answer.equals("n")) {
                System.out.println("Please provide your desired character name: ");
                String nameResponse = console.next().toLowerCase();
                player = new Player(nameResponse);
                break;
            } else {
                System.out.println("Please enter 'y' to load a game or 'n' to start a new game: ");
                answer = console.next().toLowerCase();
            }
        }
        return player;

    } // End of start

    private void save() {
        // Add save functionality here
        String fileName = "src/main/codecademy/Player.svr";
        try {
            FileOutputStream userSaveFile = new FileOutputStream(fileName);
            ObjectOutputStream playerSaver = new ObjectOutputStream(userSaveFile);
            playerSaver.writeObject(player);
        } catch (IOException e) {
            System.out.println("There was an error saving the game. The game was not saved");
        }
    } // End of save

    private Player load(String playerName, Scanner console) {
        // Add load functionality here
        Player loadedPlayer;
        try {
            FileInputStream userSaveFile = new FileInputStream(playerName + ".svr");
            ObjectInputStream playerLoader = new ObjectInputStream(userSaveFile);
            loadedPlayer = (Player) playerLoader.readObject();
        } catch (IOException | ClassNotFoundException e) {
            addDelay(1500);
            System.out.println("We are loading your player...");
            addDelay(2000);
            loadedPlayer = new Player(playerName);
        }
        return loadedPlayer;
    } // End of load

    // Adds a delay to the console so it seems like the computer is "thinking"
    // or "responding" like a human, not instantly like a computer.
    private void addDelay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
