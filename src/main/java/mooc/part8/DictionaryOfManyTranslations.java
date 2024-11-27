package mooc.part8;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    //              word        translations
    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        dictionary.remove(word);
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();

        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");
        dictionary.add("lie", "valehdella2");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        System.out.println(dictionary.translate("bow"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
