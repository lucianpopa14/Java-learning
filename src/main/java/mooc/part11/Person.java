package mooc.part11;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name != null && name.length() < 40 && !name.equals("") &&
                age > 0 && age < 120) {
            this.name = name;
            this.age = age;
        } else {
            throw new IllegalArgumentException("name should not be empty and age should be between 0 and 120");
        }
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
