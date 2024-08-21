package src.main.mooc.part5;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Archive {
    private String name;
    private String identifier;

    public Archive(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Archive)) return false;
        Archive archive = (Archive) o;
        if(this.identifier.equals(((Archive) o).identifier)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        return this.identifier + ": " + this.name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archiveList = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) break;

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            Archive archive = new Archive(name,identifier);
            if(!(archiveList.contains(archive)))
            {
                archiveList.add(archive);
            }else {
                System.out.println("Already on the list!");
            }

        }

        System.out.println("==Items==");
        for(Archive a:archiveList){
            System.out.println(a);
        }
    }
}
