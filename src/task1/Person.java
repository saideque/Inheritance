package task1;

import java.util.Scanner;

public class Person {
    private String surname;
    private String firstName;
    private String street;
    private String zipCode;
    private String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Surname: ");
        surname = scanner.nextLine();
        System.out.print("First name: ");
        firstName = scanner.nextLine();
        System.out.print("Street: ");
        street = scanner.nextLine();
        System.out.print("Zip code: ");
        zipCode = scanner.nextLine();
        System.out.print("City: ");
        city = scanner.nextLine();
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void print() {
        System.out.println("Surname:    " + surname);
        System.out.println("First name: " + firstName);
        System.out.println("Street:     " + street);
        System.out.println("Zip code:   " + zipCode);
        System.out.println("City:       " + city);
    }
}
