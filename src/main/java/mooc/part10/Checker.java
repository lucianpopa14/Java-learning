package mooc.part10;

public class Checker {
    public Checker(){}

    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public boolean allVowels(String string){
        return string.matches("^[aeiou]*");
    }
    public boolean timeOfDay(String string) {
        // Regular expression to match hh:mm:ss format
        String regex = "^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";

        // Return true if the string matches the regex, false otherwise
        return string != null && string.matches(regex);
    }

    public static void main(String[] args) {
        Checker checker = new Checker();

        System.out.println(checker.isDayOfWeek("mon"));
        System.out.println(checker.allVowels("oi"));
        System.out.println(checker.timeOfDay("17:63:05"));
    }
}
