package src.main.mooc.part4;

public class Whistle {
    private String sound;
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
    public void sound(){
        System.out.println(sound);
    }
}
