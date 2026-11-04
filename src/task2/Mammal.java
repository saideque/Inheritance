package task2;

public class Mammal extends Animal {
    private int legs;

    public Mammal() {
    }

    public Mammal(String name, int age, double weight, int legs) {
        super(name, age, weight);
        this.legs = legs;
    }

    public Mammal(String name, int legs) {
        super(name);
        this.legs = legs;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (mammal) eats food and drinks mother's milk when young.");
    }

    @Override
    public String getVoice() {
        return "Some mammal sound";
    }

    public void giveBirth() {
        System.out.println(getName() + " gives birth to live young.");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Mammal: name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", legs=" + legs;
    }
}
