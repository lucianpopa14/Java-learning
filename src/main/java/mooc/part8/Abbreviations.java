package mooc.part8;

import java.util.HashMap;

public class Abbreviations {
    private String abbreviation;
    private String explanation;
    HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbreviations.getOrDefault(abbreviation, null);
    }

    //main here for testing purposes
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }

}
