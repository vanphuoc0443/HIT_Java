public class Monkey extends Animal{
    private String favoriteFruit;

    public Monkey() {
        super();
    }

    public Monkey(String name, int age, String favoriteFruit) {
        super(name, age);
        this.favoriteFruit = favoriteFruit;
    }

    @Override
    public void makeSound() {
        System.out.println("Chít chít!");
    }
}
