public class Dog extends Animal implements Playable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public void feed() {
        // feed dog
    }

    @Override
    public void play() {
        // play with dog
    }
}
