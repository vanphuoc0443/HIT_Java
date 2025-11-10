public class Technician extends Employee {
    public String techSkill;


    public Technician() {
        super();
    }

    public Technician(String name, String country, double salary, String techSkill) {
        super(name, country, salary);
        this.techSkill = techSkill;
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "techSkill='" + techSkill + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }
}
