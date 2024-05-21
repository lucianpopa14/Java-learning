package src.main.codecademy.Serialization.project;

import java.io.Serial;
import java.io.Serializable;

public class Weapon implements Serializable {

    /* Class Variables */
    @Serial
    private static final long serialVersionUID = 1L;

    /* Instance Variables */
    private final String name;
    private final int damage;

    /* Constructors */
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    /* Getters */
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
