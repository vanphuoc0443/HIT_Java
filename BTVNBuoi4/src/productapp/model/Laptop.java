package productapp.model;

public class Laptop extends Product{
    private String ram;
    private String cpu;

    public Laptop() {
        super();
    }

    public Laptop(String name, String description, double price, String ram, String cpu) {
        super(name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(String ram, String cpu) {
        super();
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getInfo() {
        return String.format("Laptop[id=%d, name=%s, ram=%s, cpu=%s, price=%.2f]",
                getId(), getName(), ram == null ? "Unknown" : ram, cpu == null ? "Unknown" : cpu, getPrice());
    }

}
