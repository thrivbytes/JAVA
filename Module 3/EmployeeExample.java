class Employee {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.salary = 450000;
        emp.setName("Nitesh");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: ₹" + emp.getSalary());
    }
}
