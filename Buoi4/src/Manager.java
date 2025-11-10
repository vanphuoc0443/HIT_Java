import java.util.List;

public class Manager extends Employee {
    public List<SaleStaff> saleStaffs;
    public List<Technician> technicians;

    public Manager() {
        super();
    }

    public Manager(List<SaleStaff> saleStaffs, List<Technician> technicians) {
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public Manager(String name, String country, double salary, List<SaleStaff> saleStaffs, List<Technician> technicians) {
        super(name, country, salary);
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public void getSaleStaffById(int saleStaffId) {
        for (SaleStaff sa : saleStaffs) {
            if (sa.id == saleStaffId) {
                System.out.println(sa);
            }
        }
    }

    public void getTechnicianById(int technicianId) {
        for (Technician tb : technicians) {
            if (tb.id == technicianId) {
                System.out.println(tb);
            }
        }
    }


    @Override
    public String toString() {
        return "Manager{" +
                "saleStaffs=" + saleStaffs +
                ", technicians=" + technicians +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }

}
