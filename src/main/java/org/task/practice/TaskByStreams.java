package src.main.java.org.task.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmployeeBySalary {
    private String name;
    private double salary;

    public EmployeeBySalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeBySalary{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeByRank extends EmployeeBySalary {
    private int rank;

    public EmployeeByRank(String name, double salary, int rank) {
        super(name, salary);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "EmployeeByRank{" +
                "rank=" + rank +
                "} " + super.toString();
    }
}

class EmployeeByAge extends EmployeeBySalary {
    private int age;

    public EmployeeByAge(String name, double salary, int age) {
        super(name, salary);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeByAge{" +
                "age=" + age +
                "} " + super.toString();
    }
}

class EmployeeByGenderAndDept extends EmployeeByAge {
    private String gender;
    private String department;

    public EmployeeByGenderAndDept(String name, double salary, int age, String gender, String department) {
        super(name, salary, age);
        this.gender = gender;
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeByGenderAndDept{" +
                "gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                "} " + super.toString();
    }
}

class EmployeeByDept extends EmployeeBySalary {
    private String department;

    public EmployeeByDept(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeByDept{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}

public class TaskByStreams {

    public static void main(String[] args) {
        System.out.println("FIRST NON REPEATED VALUE");
        firstNonRepeated(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3));

        System.out.println("TOP N ELEMENT");
        topNElement(Arrays.asList(10, 20, 30, 40, 50, 60), 3);

        System.out.println("UNION OF THE TWO LIST");
        unionList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("INCREASE EMPLOYEE SALARY BY RANK GREATER THAN 4");
        increaseSalary(Arrays.asList(
                        new EmployeeByRank("Sachin", 50000, 5),
                        new EmployeeByRank("Saurabh", 55000, 5),
                        new EmployeeByRank("Rahul", 45000, 4),
                        new EmployeeByRank("Yuvraj", 60000, 3)
                )
        );

        System.out.println("SORT EMPLOYEE BY AGE SALARY AND NAME");
        sortEmployee(Arrays.asList(
                        new EmployeeByAge("Sachin", 45000, 30),
                        new EmployeeByAge("Saurabh", 55000, 25),
                        new EmployeeByAge("Rahul", 45000, 30),
                        new EmployeeByAge("Yuvraj", 45000, 25),
                        new EmployeeByAge("Ashish", 50000, 35)
                )
        );

        System.out.println("INTERSECTION OF TWO LISTS");
        intersection(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("REVERSE EACH WORDS");
        reverseEachWord("welcome to stream api");

        System.out.println("FILTER EMPLOYEE BY GENDER AGE DEPARTMENT AND SALARY");
        topEmployeeByDepartment(Arrays.asList(
                        new EmployeeByGenderAndDept("John", 60000, 35, "Male", "IT"),
                        new EmployeeByGenderAndDept("Steve", 75000, 38, "Male", "IT"),
                        new EmployeeByGenderAndDept("Mike", 90000, 32, "Male", "IT"),
                        new EmployeeByGenderAndDept("David", 70000, 30, "Male", "HR"),
                        new EmployeeByGenderAndDept("Chris", 85000, 31, "Male", "HR"),
                        new EmployeeByGenderAndDept("Jake", 95000, 40, "Male", "HR"),
                        new EmployeeByGenderAndDept("Paul", 80000, 36, "Male", "Finance"),
                        new EmployeeByGenderAndDept("Tom", 78000, 33, "Male", "Finance"),
                        new EmployeeByGenderAndDept("Eric", 88000, 39, "Male", "Finance"),
                        new EmployeeByGenderAndDept("Riya", 86000, 39, "Male", "Finance"),
                        new EmployeeByGenderAndDept("Saniya", 78000, 39, "Male", "Finance")
                )
        );

        System.out.println("Nth EMPLOYEE WITH HIGHEST SALARY");
        highestNEmployee(Arrays.asList(
                new EmployeeBySalary("John", 50000),
                new EmployeeBySalary("Steve", 70000),
                new EmployeeBySalary("Mike", 60000),
                new EmployeeBySalary("David", 80000),
                new EmployeeBySalary("Chris", 75000),
                new EmployeeBySalary("Jake", 90000),
                new EmployeeBySalary("Paul", 85000)
        ), 3);

        System.out.println("MAXIMUM LENGTH WORD");
        longestWord("welcome to streamapis");

        System.out.println("AVERAGE SALARY BY EACH DEPARTMENT");
        avgSalaryByDept(
                Arrays.asList(
                        new EmployeeByDept("Alice", 50000, "HR"),
                        new EmployeeByDept("Bob", 60000, "IT"),
                        new EmployeeByDept("Charlie", 70000, "HR"),
                        new EmployeeByDept("David", 75000, "IT"),
                        new EmployeeByDept("Eve", 80000, "Finance"),
                        new EmployeeByDept("Frank", 85000, "Finance")
                )
        );
    }

    private static void firstNonRepeated(List<Integer> numbers) {
        Map.Entry<Integer, Long> value = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst().get();
        System.out.println("First non repeated value is " + value.getKey());
        System.out.println();
    }

    private static void topNElement(List<Integer> numbers, int n) {
        List<Integer> topElements = numbers.stream()
                .sorted(Comparator.reverseOrder()).limit(n)
                .collect(Collectors.toList());
        System.out.println("Top N element " + topElements);
        System.out.println();
    }

    private static void unionList(List<Integer> a, List<Integer> b) {
        List<Integer> union = Stream.concat(a.stream(), b.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Union of the two list " + union);
        System.out.println();
    }

    private static void increaseSalary(List<EmployeeByRank> employees) {
        List<EmployeeByRank> employeeList = employees.stream()
                .peek(e -> {
                    if (e.getRank() > 4) e.setSalary(e.getSalary() * 1.10);
                })
                .collect(Collectors.toList());
        employeeList.forEach(System.out::println);
        System.out.println();
    }

    private static void sortEmployee(List<EmployeeByAge> employees) {
        List<EmployeeByAge> employeeList = employees.stream()
                .sorted(Comparator.comparing(EmployeeByAge::getAge).thenComparing(EmployeeByAge::getSalary).thenComparing(EmployeeByAge::getName))
                .collect(Collectors.toList());
        employeeList.forEach(System.out::println);
        System.out.println();
    }

    private static void intersection(List<Integer> a, List<Integer> b) {
        List<Integer> intersection = a.stream()
                .filter(b::contains)
                .collect(Collectors.toList());
        System.out.println("Intersection " + intersection);
        System.out.println();
    }

    private static void reverseEachWord(String str) {
        String[] words = str.split(" ");
        String reverseString = Arrays.stream(words)
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed string: " + reverseString);
        System.out.println();
    }

    private static void topEmployeeByDepartment(List<EmployeeByGenderAndDept> employees) {
        Map<String, List<EmployeeByGenderAndDept>> filterPersons = employees.stream()
                .filter(p -> p.getGender().equalsIgnoreCase("Male"))
                .filter(p -> p.getAge() >= 30 && p.getAge() <= 40)
                .collect(Collectors.groupingBy(EmployeeByGenderAndDept::getDepartment));

        Map<String, List<EmployeeByGenderAndDept>> map = new HashMap<>();
        filterPersons.forEach((dept, people) -> {
            List<EmployeeByGenderAndDept> personList = people.stream()
                    .sorted(Comparator.comparingDouble(EmployeeByGenderAndDept::getSalary).reversed())
                    .limit(3)
                    .collect(Collectors.toList());
            map.put(dept, personList);
        });

        map.forEach((department, persons) -> {
            System.out.println(department);
            persons.forEach(System.out::println);
        });
        System.out.println();
    }

    private static void highestNEmployee(List<EmployeeBySalary> employees, int n) {
        EmployeeBySalary employee = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeBySalary::getSalary).reversed())
                .skip(n - 1)
                .findFirst().get();
        System.out.println("Employee with 3rd highest salary with: ");
        System.out.println(employee);
        System.out.println();
    }

    private static void longestWord(String str) {
        String[] words = str.split(" ");
        String maxLengthWord = Stream.of(words)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(maxLengthWord);
        System.out.println();
    }

    private static void avgSalaryByDept(List<EmployeeByDept> employees) {
        employees.stream()
                .collect(Collectors.groupingBy(EmployeeByDept::getDepartment, Collectors.averagingDouble(EmployeeByDept::getSalary)))
                .forEach((dept, avg) -> System.out.println(String.format("Department: %s, Average Salary: %s", dept, avg)));
        System.out.println();
    }
}
