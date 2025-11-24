public class Lion extends Animal {
    private float weight;

    public Lion() {
        super();
    }

    public Lion(String name, int age, float weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Gào!");
    }
}
