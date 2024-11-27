package mooc.part8.vehicleregistry;

import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate plate : registry.keySet()) {
            if (plate.equals(licensePlate)) {
                return false;
            }

        }
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (registry.get(licensePlate).isEmpty()) {
            return null;
        } else {
            return registry.get(licensePlate);
        }
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.get(licensePlate).isEmpty()) {
            return false;
        } else {
            registry.remove(licensePlate);
            return true;

        }
    }
    public void printLicensePlates(){
        System.out.println(registry.keySet());
    }
    public void printOwners(){
        System.out.println(registry.values());
    }
}