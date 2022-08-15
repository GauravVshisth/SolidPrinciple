package domain;

// Pojo java class
public class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee [department=" + department + ", id=" + id + ", name=" + name + ", working=" + working + "]";
    }

    public static class EmployeeDAO {

        public void saveEmployee(Employee employee) {
            System.out.println("saved employee to the database " + employee);
        }

        public void deleteEmployee(Employee employee) {
            System.out.println("delete employee from the database " + employee);
        }
    }
}
