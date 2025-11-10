package productapp.model;

public class SmartPhone extends Product{
    private boolean has5G;

    public SmartPhone(String name, String description, double price, boolean has5G) {
        super();
    }

    public SmartPhone(boolean has5G) {
        super();
        this.has5G = has5G;
    }

    public SmartPhone(String name, String description, int price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }

    @Override
    public String getInfo() {
        return String.format("SmartPhone[id=%d, name=%s, 5G=%s, price=%.2f]",
                getId(), getName(), has5G ? "Yes" : "No", getPrice());
    }

}
