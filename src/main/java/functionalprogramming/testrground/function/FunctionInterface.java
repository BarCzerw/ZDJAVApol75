package functionalprogramming.testrground.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {

        Function<Employee, String> byName = employee -> employee.getName();

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Bart"),
                new Employee("Mart"),
                new Employee("Dart"),
                new Employee("Art")
        ));

        showEmployee(employees, byName);

    }

    private static void showEmployee(List<Employee> employees, Function<Employee, String> printer) {
        for (Employee employee : employees) {
            System.out.println(printer.apply(employee));
        }
    }

    private static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
