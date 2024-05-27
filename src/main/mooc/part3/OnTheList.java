package src.main.mooc.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        System.out.println("Search for?");
        String searchFor = scanner.nextLine();
        for (String name : names) {
            if (name.equals(searchFor)) {
                System.out.println(name + " was found!");
            }
        }
    }
}
