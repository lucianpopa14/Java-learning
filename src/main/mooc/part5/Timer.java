package src.main.mooc.part5;

public class Timer {
    private ClockHand hundredths = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);

    public void advance() {
        hundredths.advance();
        if (hundredths.value() == 0) {
            seconds.advance();
        }
    }

    public Timer() {

    }

    @Override
    public String toString() {
        return seconds + ":" + hundredths;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
