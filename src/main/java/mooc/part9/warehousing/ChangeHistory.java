package mooc.part9.warehousing;

import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        double max = 0;
        if (history.isEmpty()) {
            return 0;
        } else {
            for (Double i : history) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
    }

    public double minValue() {
        double min = 5000000;
        if (history.isEmpty()) {
            return 0;
        } else {
            for (Double i : history) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
    }

    public double average() {
        int sum = 0;
        if (history.isEmpty()) {
            return 0;
        } else {
            for (Double i : history) {
                sum += i;
            }
        }
        return (double) sum/ history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
