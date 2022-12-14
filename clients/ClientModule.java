package clients;

import domain.Doctor;
import domain.Employee;
import domain.Nurse;
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
        final Employee tarun = new Doctor(1, "Tarun", "emergency", true);
        ClientModule.hireNewEmployee(tarun);
        final EmergencyRoom emergencyRoom = new EmergencyRoom();
        emergencyRoom.emergencySituation(tarun);
        ClientModule.printEmployeeReport(tarun,FormatType.XML);
        final Employee suzen = new Nurse(2,"Suzen","emergency",true);
        ClientModule.hireNewEmployee(suzen);
        emergencyRoom.emergencySituation(suzen);

    }
}
