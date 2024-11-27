package mooc.part9.personsubclasses;

public class Student extends Person{
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public void study(){
        credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n \tStudy credits: "+ getCredits();
    }
}
