package task2;

public class Fish extends Animal {
    private boolean saltwater;

    public Fish() {
    }

    public Fish(String name, int age, double weight, boolean saltwater) {
        super(name, age, weight);
        this.saltwater = saltwater;
    }

    public Fish(String name, boolean saltwater) {
        super(name);
        this.saltwater = saltwater;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (fish) eats plankton and smaller fish.");
    }

    @Override
    public String getVoice() {
        return "Blub blub";
    }

    /** Method specific to fish. */
    public void swim() {
        System.out.println(getName() + " swims in " + (saltwater ? "salt" : "fresh") + " water.");
    }

    public boolean isSaltwater() {
        return saltwater;
    }

    public void setSaltwater(boolean saltwater) {
        this.saltwater = saltwater;
    }

    @Override
    public String toString() {
        return "Fish: name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", saltwater=" + saltwater;
    }
}
