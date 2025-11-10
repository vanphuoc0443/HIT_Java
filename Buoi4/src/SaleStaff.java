public class SaleStaff extends Employee {
    public int numbersOfSale;

    public SaleStaff() {
        super();
    }

    public SaleStaff(String name, String country, double salary, int numbersOfSale) {
        super(name, country, salary);
        this.numbersOfSale = numbersOfSale;
    }

    public int getNumbersOfSale() {
        return numbersOfSale;
    }

    public void setNumbersOfSale(int numbersOfSale) {
        this.numbersOfSale = numbersOfSale;
    }

    @Override
    public String toString() {
        return "SaleStaff{" +
                "numbersOfSale=" + numbersOfSale +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }
}
