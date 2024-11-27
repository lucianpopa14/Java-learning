package mooc.part4;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Item {

    private String name;
    private LocalDateTime createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            else {
                Item item = new Item(input);
                 list.add(String.valueOf(item));
            }
        }
        System.out.println(list);
    }
}