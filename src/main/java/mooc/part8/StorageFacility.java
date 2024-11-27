package mooc.part8;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    //              unit        items
    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> items = storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void removeOneItemFromAnUnit(String storageUnit, String item) {
        ArrayList<String> items = storage.get(storageUnit);
        items.remove(item);
        storage.put(storageUnit, items);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : storage.keySet()) {
            units.add(unit);
        }
        return units;
    }

    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.removeOneItemFromAnUnit("f156", "rollerblades");

        System.out.println(facility.contents("f156"));
        System.out.println(facility.storageUnits());
    }
}
