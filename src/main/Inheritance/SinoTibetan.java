package src.main.Inheritance;

public class SinoTibetan extends Language{
    SinoTibetan(String name, Integer numSpeakers){
        super(name, numSpeakers, "Asia", "subject-object-verb");
        if(this.name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }

}
