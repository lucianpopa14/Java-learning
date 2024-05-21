package src.main.codecademy.Serialization.project;

import java.io.Serial;
import java.io.Serializable;

public class Helmet extends Armour implements Serializable {

    /* Class Variables */
    @Serial
    private static final long serialVersionUID = 1L;

    /* Constructors */
    public Helmet(String name, int durability, int defenseRating) {
        super(name, durability, defenseRating);
    }
}
