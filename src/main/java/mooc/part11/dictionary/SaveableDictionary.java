package mooc.part11.dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        dictionary.put(parts[0], parts[1]);
                        dictionary.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error saving dictionary: " + e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation) {
        dictionary.put(words, translation);
    }

    public void delete(String word) {
        String translation = translate(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }

    public String translate(String word) {
        return dictionary.getOrDefault(word, null);
    }

    public static void main(String[] args) {
        // Initialize the dictionary with the file path
        SaveableDictionary dictionary = new SaveableDictionary("mooc/part11/dictionary/words.txt");

        // Add entries to the dictionary
        dictionary.add("apina", "monkey");
        dictionary.add("ohjelmointi", "programming");

        // Save the dictionary to the file
        boolean success = dictionary.save();
        if (success) {
            System.out.println("Dictionary saved successfully.");
        } else {
            System.err.println("Failed to save the dictionary.");
        }

    }
}