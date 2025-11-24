public class Elephant extends Animal {
    private float trunkLength;

    public Elephant() {
        super();
    }

    public Elephant(String name, int age, float trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
    }

    public float getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(float trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Ù ò ò!!!");
    }
}
