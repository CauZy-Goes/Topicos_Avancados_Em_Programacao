import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("João", 30, 3500.0),
                new Employee("Maria", 25, 4200.0),
                new Employee("Carlos", 40, 5800.0)
        );




//        employees.forEach(System.out::println);
//
//        employees.stream()
//                .forEach(System.out::println);
//
//        employees.stream()
//                .map(Employee::toString)
//                .forEach(System.out::println);
//
//        employees.stream()
//                .map(Employee::getName)
//                .forEach(System.out::println);

    }
}
