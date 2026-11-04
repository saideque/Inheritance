package task2;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (bird) pecks seeds and insects.");
    }

    @Override
    public String getVoice() {
        return "Some bird chirp";
    }

    public void fly() {
        System.out.println(getName() + " spreads its " + featherColor + " wings and flies.");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird: name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", featherColor=" + featherColor;
    }
}
