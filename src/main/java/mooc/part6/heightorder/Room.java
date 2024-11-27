package mooc.part6.heightorder;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons = new ArrayList<>();

    public Room() {
        this.persons = persons;
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortest = persons.get(0);
        for (Person p : persons) {
            if (p.getHeight() < shortest.getHeight()) {
                shortest = p;
            }
        }
        return shortest;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        persons.remove(shortest());
        return shortest;
    }

    //main for test reasons
    public static void main(String[] args) {
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
