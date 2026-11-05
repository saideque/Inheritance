package task2;

public class Blowfish extends Fish implements AnimalBehavior {
    private boolean poisonous;

    public Blowfish() {
    }

    public Blowfish(String name, int age, double weight, boolean saltwater, boolean poisonous) {
        super(name, age, weight, saltwater);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, boolean poisonous) {
        super(name, true);
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish crushes algae and small crustaceans.");
    }

    @Override
    public String getVoice() {
        return "Pfff (puffs up)";
    }

    public void inflate() {
        System.out.println(getName() + " inflates into a spiky ball"
                + (poisonous ? " full of toxins!" : "."));
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the blowfish rests motionless near the reef and sleeps.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Blowfish: name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight()
                + ", saltwater=" + isSaltwater() + ", poisonous=" + poisonous;
    }
}
