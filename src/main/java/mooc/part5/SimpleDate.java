package mooc.part5;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (day < 30) {
            day++;
        } else {
            if (month < 12) {
                month++;
                day = 1;
            } else {
                year++;
                month = 1;
            }
        }
    }

    public void advance(int howManyDays) {
        for (int i = 1; i <= howManyDays; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println(date);
        System.out.println("after three days: "+date.afterNumberOfDays(3));
        System.out.println("after one week: "+date.afterNumberOfDays(7));
        System.out.println("after one month: "+date.afterNumberOfDays(30));
        System.out.println("after one year: "+date.afterNumberOfDays(365));
    }
}
