package mooc.part4;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> tvList = new ArrayList<>();

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
                System.out.println("Duration: ");
                int duration = Integer.valueOf(scanner.nextLine());
                tvList.add(new TelevisionProgram(name, duration));
        }
        System.out.println("Program's maximum duration? ");
        int comparator = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : tvList) {
            if (program.getDuration() <= comparator) {
                System.out.println(program.getName()+", "+program.getDuration());
            }
        }
    }
}
