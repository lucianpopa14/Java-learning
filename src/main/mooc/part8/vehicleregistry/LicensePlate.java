package src.main.mooc.part8.vehicleregistry;

import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String liNumber, String country) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public String getLiNumber() {
        return liNumber;
    }

    @Override
    public String toString() {
        return country+" "+liNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LicensePlate that = (LicensePlate) o;
        return Objects.equals(liNumber, that.liNumber) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }
}
