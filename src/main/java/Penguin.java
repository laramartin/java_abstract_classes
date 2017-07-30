public class Penguin extends Animal {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public int getLegs() {
        return 2;
    }

    @Override
    public void feed() {
        // feed penguin
    }
}
