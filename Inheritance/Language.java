package Inheritance;

public class Language {
    protected String name;
    protected Integer numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, Integer numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }
    public void getInfo(){
        System.out.println(this.name+" is spoken by "+this.numSpeakers+" people mainly in "+this.regionsSpoken+".");
        System.out.println("The language follows the word order: "+this.wordOrder);
    }
    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555_000_000, "Spain, Latin America", "subject-verb-object");
        spanish.getInfo();
        Mayan ixil = new Mayan("Ixil", 83600);
        ixil.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 332894298);
        SinoTibetan burmese = new SinoTibetan("Burmese", 500000);
        mandarin.getInfo();
        burmese.getInfo();

    }
}
