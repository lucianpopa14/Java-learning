package src.main.mooc.part4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("name of the file: ");
        String fileName = scanner.nextLine();

            try (Scanner scanner1 = new Scanner(Paths.get("C:/Users/thinkpad/IdeaProjects/Java-learning/src/main/mooc/"+fileName))) {

                while (scanner1.hasNextLine()) {

                    String[] parts = scanner1.nextLine().split(",");
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);

                    System.out.println(name+", age: "+age);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }