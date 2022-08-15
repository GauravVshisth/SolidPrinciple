package clients;

import domain.Employee;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
    public static void hireNewEmployee(final Employee employee) {
        final Employee.EmployeeDAO employeeDAO = new Employee.EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(final Employee employee) {
        final Employee.EmployeeDAO employeeDAO = new Employee.EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(final Employee employee,final FormatType formatType) {
        final EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(employeeReportFormatter.getFormattedEmployee());
    }

    public static void main(final String[] args) {
        final Employee tarun = new Employee(1, "Tarun", "accounting", true);
        ClientModule.hireNewEmployee(tarun);
        ClientModule.printEmployeeReport(tarun,FormatType.XML);
    }
}
