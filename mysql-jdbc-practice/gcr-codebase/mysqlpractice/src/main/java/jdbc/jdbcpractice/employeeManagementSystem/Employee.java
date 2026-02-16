package jdbc.jdbcpractice.employeeManagementSystem;


public class Employee {
    private int empID;
    private String empName;
    private double empSalary;

    public Employee() {}

    public Employee(String name, double salary) {
        this.empName = name;
        this.empSalary = salary;
    }

    public int getId() { return empID; }
    public String getName() { return empName; }
    public double getSalary() { return empSalary; }

    public void setId(int id) { this.empID = id; }
    public void setName(String name) { this.empName = name; }
    public void setSalary(double salary) { this.empSalary = salary; }
}