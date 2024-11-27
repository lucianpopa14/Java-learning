package mooc.part4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) throws IOException {

        try ( Scanner scanner = new Scanner(Paths.get("mooc/data.txt"))) {

            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();

                System.out.println(row);

            }

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
