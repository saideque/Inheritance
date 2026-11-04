package task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Dog("Rex", 3, 25.5, 4, "German Shepherd");
        animals[1] = new Pigeon("Pidgey", 2, 0.4, "white", "homing pigeon");

        Blowfish spike = new Blowfish("Spike", true);
        spike.setAge(1);
        spike.setWeight(1.2);
        animals[2] = spike;

        Dog bella = new Dog("Bella", "Labrador");
        bella.setAge(5);
        bella.setWeight(30.0);
        animals[3] = bella;

        animals[4] = new Fish("Nemo", 1, 0.2, true);

        Pigeon pigeon = new Pigeon();
        pigeon.setName("Grey");
        pigeon.setAge(4);
        pigeon.setWeight(0.5);
        pigeon.setFeatherColor("grey");
        pigeon.setSpecies("rock dove");
        animals[5] = pigeon;

        for (int i = 0; i < animals.length; i++) {
            System.out.println("--- animal #" + (i + 1) + " ---");
            System.out.println(animals[i]);
            animals[i].eat();
            System.out.println("Voice: " + animals[i].getVoice());

            if (animals[i] instanceof Dog dog) {
                dog.giveBirth(); // inherited from Mammal
                dog.fetch();
            } else if (animals[i] instanceof Pigeon p) {
                p.fly(); // inherited from Bird
                p.carryMessage();
            } else if (animals[i] instanceof Blowfish b) {
                b.swim(); // inherited from Fish
                b.inflate();
            } else if (animals[i] instanceof Fish f) {
                f.swim();
            }
            System.out.println();
        }
    }
}
