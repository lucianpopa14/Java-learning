package src.main.mooc.part8;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hashMap;

    public IOU() {
        this.hashMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        hashMap.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return hashMap.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
