class Employee {
    private String name;
    private int emp_id = 0;
    private double salary = 0;

    public void getter() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + emp_id);
        System.out.println("Salary: " + salary);
    }

    public void setter(String empName, int num, double empSalary) {
        name = empName;
        emp_id = num;
        salary = empSalary;
    }
}

class Task1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setter("Alex", 10256, 55000.0);
        emp.getter();
    }
}

