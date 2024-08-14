package src.main.mooc.part5.healthStation;

public class HealthStation {
    private int weighins;
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighins++;
        return person.getWeight();
    }
    public void feed(Person person){
        int weight = person.getWeight();
        person.setWeight(weight+1);
    }
    public int weighings(){
        return weighins;
    }
}
