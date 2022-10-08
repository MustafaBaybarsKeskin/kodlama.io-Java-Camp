/*
--- INHERITANCE ---
Inheritance'ın kelime anlamı mirastır. Bunları biz class'lar arasında yapabiliyotuz.
İki nesne arasında miras durumu oluşturur. Bir nesne diğer nesneye miras bırakır.
Böylelikle bir class diğer bir class'ın özelliklerini kullanabilir.
 */

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.firstName = "Ahmet";
        employee.firstName = "Ali";

        customer.email = "ahmet@gmail.com";
        employee.salary = 5500;

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.add();
        employeeManager.add();

        employeeManager.bestEmployee();
    }
}