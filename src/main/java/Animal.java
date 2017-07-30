public abstract class Animal {

    public Animal(String name) {
        this.name = name;
    }

    protected String name;

    public void poop() {
        // everyone poooooops
    }

    public abstract int getLegs();

    public abstract void feed();
}
