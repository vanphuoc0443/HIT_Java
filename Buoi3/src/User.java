import java.util.Random;

public class User {
    Random rand = new Random();
    private final int id;
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.id = rand.nextInt(100);
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void withDraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Số tiền rút phải lớn hơn 0");
        if (amount > balance) throw new IllegalArgumentException("Số dư không đủ");
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Số tiền nạp phải lớn hơn 0");
        balance += amount;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', balance=" + balance + "}";
    }
}
