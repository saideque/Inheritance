package task1;

import java.util.Scanner;

public class Staff extends Person {
    private String education;
    private String position;

    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Education: ");
        education = scanner.nextLine();
        System.out.print("Position: ");
        position = scanner.nextLine();
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void print1() {
        print();
        System.out.println("Education:  " + education);
        System.out.println("Position:   " + position);
    }
}
