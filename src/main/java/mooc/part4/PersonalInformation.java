package mooc.part4;


import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName + " (" + this.identificationNumber + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> list = new ArrayList<>();

        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            } else {
                System.out.println("Last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Identification number: ");
                String identificationNumber = scanner.nextLine();
                list.add(new PersonalInformation(firstName,lastName,identificationNumber));
            }
        }
        for(PersonalInformation person : list){
            System.out.println(person.getFirstName()+" "+person.getLastName());
        }
    }
}