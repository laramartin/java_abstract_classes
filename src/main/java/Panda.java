public class Panda extends Animal {

    public Panda(String name) {
        super(name);
    }

    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public void feed() {
        // feed panda
    }
}
