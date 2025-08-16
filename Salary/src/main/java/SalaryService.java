public class SalaryService {

    public static void adjustSalary(Employee employee, Double adjustPercent) {
        employee.setSalary(employee.getSalary() + (employee.getSalary() * adjustPercent)/100);
    }
}
