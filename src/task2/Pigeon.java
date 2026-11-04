package task2;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the " + species + " pecks grain in the square.");
    }

    @Override
    public String getVoice() {
        return "Coo-coo";
    }

    public void carryMessage() {
        System.out.println(getName() + " carries a message back to the loft.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon: name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight()
                + ", featherColor=" + getFeatherColor() + ", species=" + species;
    }
}
