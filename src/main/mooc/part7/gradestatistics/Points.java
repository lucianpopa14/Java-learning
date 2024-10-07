package src.main.mooc.part7.gradestatistics;

import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;

    public Points() {
        this.points = new ArrayList<>();
    }

    public void addPoints(int pointToAdd) {
        if (pointToAdd >= 0 && pointToAdd <= 100) {
            points.add(pointToAdd);
        }
    }

    public double calculateAverage() {
        int sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return (double) sum / points.size();
    }

}