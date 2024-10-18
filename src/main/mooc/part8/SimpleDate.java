package src.main.mooc.part8;

import java.util.Objects;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleDate that = (SimpleDate) o;
        return day == that.day && month == that.month && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1,2,2000);
        System.out.println(date.equals("heh"));
        System.out.println(date.equals(new SimpleDate(5,2,2011)));
        System.out.println(date.equals(new SimpleDate(1,2,2000)));
    }
}
