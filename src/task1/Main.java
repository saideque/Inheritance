package task1;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();

        staff.setSurname("Vladislav");
        staff.setFirstName("Karzhaubayev");
        staff.setStreet("Dunikowskiego 3");
        staff.setZipCode("02-913");
        staff.setCity("Warsaw");
        staff.setEducation("Master's degree");
        staff.setPosition("Software Engineer");

        System.out.println("=== Staff data ===");
        staff.print1();

    }
}
