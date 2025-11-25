
import com.model.Employee;
import com.service.IEmployeeServiceImpl;


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    IEmployeeServiceImpl service = new IEmployeeServiceImpl();
    boolean flag = true;
    while (flag) {
        menu();
        System.out.println("Nhap lua chon cua ban: ");
        int chon = sc.nextInt();
        sc.nextLine();
        switch (chon){
            case 1:
                List<Employee> employees = service.getAllEmployees();
                for(Employee employee : employees){
                    System.out.println(employee);
                }
                break;
            case 2:
                System.out.println("Nhap id: ");
                String id = sc.nextLine();
                Employee employee = service.getEmployeeById(id);
                System.out.println(employee);
                break;
            case 3:
                System.out.println("Nhap ten: ");
                String name = sc.nextLine();
                List<Employee> result = service.getEmployeeByName(name);
                for(Employee employee1 : result){
                    System.out.println(employee1);
                }
                break;
            case 4:
                System.out.println("hen gap lai");
                flag = false;
                break;
        }
    }
}

public static void menu(){
    System.out.println("----- Menu -----");
    System.out.println("1. In ra danh sách tất cả các nhân viên");
    System.out.println("2. In ra thông tin nhiên viên theo ID");
    System.out.println("3. Lọc ra danh sách nhân viên theo Tên \n");
    System.out.println("4. Thoát");
}