package ra.presentation;

import ra.businessImp.Employee;

import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        boolean flag = false;
        do {
            System.out.println("\n=============Menu=============");
            System.out.println("1. Nhập thông tin cho n nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tính lương cho các nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo tên");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên");
            System.out.println("7. Sắp xếp nhân viên theo lương tăng dần");
            System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần");
            System.out.println("9. Thoát");
            System.out.print("\nNhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("\nNhập thông tin nhân viên");
                    System.out.print("Nhập số lượng nhân viên: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 1; i <= n; i++) {
                        Employee employee = new Employee();
                        employee.inputData(sc);
                        employees.add(employee);
                        System.out.println(i < n ? "------------" : "");
                    }
                    break;
                case 2:
                    System.out.println("\n=========Thông tin nhân viên========");
                    for (int i = 0; i < employees.size(); i++) {
                        employees.get(i).displayData();
                        System.out.println(i < employees.size() - 1 ? "------------" : "");
                    }
                    break;
                case 3:
                    System.out.println("\nLương của các nhân viên");
                    for (int i = 0; i < employees.size(); i++) {
                        float salary = employees.get(i).calSalary();
                        System.out.println("Lương của " + employees.get(i).getName() + " là: " + salary);
                        System.out.println(i < employees.size() - 1 ? "------------" : "");
                    }
                    break;
                case 4:
                    System.out.print("\nNhập tên nhân viên: ");
                    String name = sc.nextLine();
                    boolean check = false;
                    for (Employee value : employees) {
                        if (value.getName().equals(name)) {
                            System.out.println("Đây là nhân viên tên: " + value.getName());
                            value.displayData();
                            check = true;
                            System.out.println();
                        }
                    }
                    if (!check) {
                        System.out.println("\nKhông có nhân viên như vậy");
                    }
                    break;
                case 5:
                    System.out.println("\nChưa làm");
                    break;
                case 6:
                    System.out.print("\nNhập Id cần xóa: ");
                    String id = sc.nextLine();
                    boolean check2 = false;
                    Iterator<Employee> iterator = employees.iterator();
                    while (iterator.hasNext()) {
                        Employee employee = iterator.next();
                        if (employee.getId().equals(id)) {
                            iterator.remove();
                            check2 = true;
                        }
                    }
                    if (!check2) {
                        System.out.println("Không có Id nhân viên đấy");
                    }else{
                        System.out.println("Đã xóa thành công");
                    }
                    break;
                case 7:
                    Collections.sort(employees, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return Float.compare(o1.getSalary(), o2.getSalary());
                        }
                    });
                    for (int i = 0; i < employees.size(); i++) {
                        employees.get(i).displayData();
                        float salary = employees.get(i).calSalary();
                        System.out.println("Lương của " + employees.get(i).getName() + " là: " + salary);
                        System.out.println(i < employees.size() - 1 ? "------------" : "");
                    }
                    break;
                case 8:
                    Collections.sort(employees, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return o2.getName().compareTo(o1.getName());
                        }
                    });
                    for (int i = 0; i < employees.size(); i++) {
                        employees.get(i).displayData();
                        System.out.println(i < employees.size() - 1 ? "------------" : "");
                    }
                    break;
                case 9:
                    flag = true;
                    System.out.println("Đã thoát chương trình");
                    break;
                default:
                    System.out.println("Nhập không hợp lệ. Vui lòng nhập lại!");
            }
        } while (!flag);
    }
}
