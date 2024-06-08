package src.main.java.org.task.interview;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


}

class Department {

    private int departmentId;
    private String department;

    public Department(int departmentId, String department) {
        this.departmentId = departmentId;
        this.department = department;
    }

}

public class HighestEmployee {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR"),
                new Employee(2, "Bob", "Engineering"),
                new Employee(3, "Charlie", "HR"),
                new Employee(4, "David", "Engineering"),
                new Employee(5, "Eve", "Engineering"),
                new Employee(6, "Frank", "Marketing")
        );

        List<Department> departments = Arrays.asList(
                new Department(1, "HR"),
                new Department(2, "Engineering"),
                new Department(3, "Marketing")
        );

        //by using Stream API
        Map<String, Long> mapEntry = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> set = mapEntry.entrySet();
        Optional<Map.Entry<String, Long>> maxValue = set.stream().max(Map.Entry.comparingByValue());

        maxValue.ifPresent(value -> System.out.println(value.getKey() + " Department Having " + value.getValue() + " Employees"));
    }

}
