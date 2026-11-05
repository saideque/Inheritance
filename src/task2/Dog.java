package task2;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, double weight, int legs, String breed) {
        super(name, age, weight, legs);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, 4);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the " + breed + " dog eats kibble and gnaws a bone.");
    }

    @Override
    public String getVoice() {
        return "Woof! Woof!";
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball and brings it back.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the dog curls up in its basket and sleeps.");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog: name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", legs=" + getLegs() + ", breed=" + breed;
    }
}
