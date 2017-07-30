import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
        animals.add(new Penguin("Pingu"));
        animals.add(new Panda("Bamboo"));
        animals.add(new Dog("Doguie"));

        Animal animal = animals.get(2);
        if (animal instanceof Dog) {
            ((Dog) animal).play();
        }

    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

}
