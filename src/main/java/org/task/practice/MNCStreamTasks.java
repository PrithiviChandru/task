package src.main.java.org.task.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class EmployeeByDeptAndExperience {
    private String name;
    private String department;
    private int experience;

    public EmployeeByDeptAndExperience(String name, String department, int experience) {
        this.name = name;
        this.department = department;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "EmployeeByDeptAndExperience{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                '}';
    }
}

public class MNCStreamTasks extends Object {

    public static void main(String[] args) {
        System.out.println("FIND EVEN NUMBERS BY STREAMS");
        evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println("FIND NUMBERS STARTING WITH ONE BY STREAMS");
        startingWithOne(Arrays.asList(10, 13, 8, 49, 17, 96, 39));

        System.out.println("PRINT RANDOM NUMBERS BY INPUT");
        randomNumbers(5);

        System.out.println("SORT NUMBERS ASCENDING AND DESCENDING BY STREAM");
        sortByAscAndDesc(Arrays.asList(12, 10, 15, 7, 89, 67));

        System.out.println("FIND FIRST NON REPEATED CHARACTER");
        firstNonRepeatedChar("abcdab");

        System.out.println("FIND NAMES WITH LENGTH MORE THAN FIVE BY STREAMS");
        findByNameLength(Arrays.asList("Sachin", "Virendra", "Rahul", "Mahi", "Yuvi"));

        System.out.println("PRINT ONLY UNIQUE CHARACTER GIVEN STRING BY STREAMS");
        uniqueChar("welcome");

        System.out.println("PRINT ODD AND EVEN NUMBERS BY STREAMS");
        findOddAndEven(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("CONVERT FIRST CHAR TO UPPERCASE BY STREAMS");
        firstUpperCase("welcome to java stream apis");

        System.out.println("FIND STRING LENGTH BY STREAMS");
        findStringLength(Arrays.asList("apple", "banana", "cherry", "coconut"));

        System.out.println("FIND AGGREGATION OF INTEGER LIST BY STREAMS");
        numbersAggregation(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("FIND EMPLOYEES COUNT WITH MORE THAN 20 YEARS BY DEPARTMENT");
        countEmployeeByExp(
                Arrays.asList(
                        new EmployeeByDeptAndExperience("John Doe", "HR", 25),
                        new EmployeeByDeptAndExperience("Jane Smith", "IT", 15),
                        new EmployeeByDeptAndExperience("Emily Davis", "Finance", 25),
                        new EmployeeByDeptAndExperience("Michael Brown", "IT", 30),
                        new EmployeeByDeptAndExperience("James Wilson", "HR", 28)
                )
        );

        System.out.println("CHECK PRESENT NUMBER IN THE LIST");
        presentNumber(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), 5);

        System.out.println("CHECK DIVISIBLE BY THE NUMBERS");
        divisibleByNumber(Arrays.asList(5, 10, 15, 25), 5);

        System.out.println("GET COMMON ELEMENT IN TWO ARRAYS");
        commonNumbers(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6, 7});

        System.out.println("GET SUB STRING IN LIST");
        containSubString(
                Arrays.asList("Java", "Spring Boot", "MicroServices", "API", "Spring Cloud"),
                "Spring"
        );
    }

    private static void evenNumbers(int[] arr) {
        Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void startingWithOne(List<Integer> numbers) {
        numbers.stream()
                .map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .forEach(System.out::println);
        System.out.println();
    }

    private static void randomNumbers(int n) {
        Random random = new Random();
        random.ints(10, 99)
                .limit(n)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void sortByAscAndDesc(List<Integer> numbers) {
        System.out.println("Sort By Ascending");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Sort By Descending");
        numbers.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
        System.out.println();
    }

    private static void firstNonRepeatedChar(String str) {
        boolean nonR = false;
        for (char c : str.toCharArray()) {
            int first = str.indexOf(c);
            int last = str.lastIndexOf(c);
            if (first == last) {
                System.out.println("First Non Repeated Character is " + c);
                nonR = true;
                break;
            }
        }
        if (!nonR) System.out.println("All Characters are repeated");
        System.out.println();
    }

    private static void findByNameLength(List<String> names) {
        List<String> n = names.stream()
                .filter(name -> name.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Number of players with name length more than five are: " + n.size());
        System.out.println("Players name with name length more than five: ");
        n.forEach(System.out::println);
        System.out.println();
    }

    private static void uniqueChar(String str) {
        String filtered = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(v -> v.getValue() == 1)
                .map(c -> c.getKey())
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("String with unique element " + filtered);
        System.out.println();
    }

    private static void findOddAndEven(List<Integer> numbers) {
        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenNumbers = map.get(true);
        List<Integer> oddNumbers = map.get(false);
        System.out.println("Even numbers " + evenNumbers);
        System.out.println("Odd numbers " + oddNumbers);
        System.out.println();
    }

    private static void firstUpperCase(String str) {
        String[] sArr = str.split(" ");
        String output = Arrays.stream(sArr)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));
        System.out.println("Changed string: " + output);
        System.out.println();
    }

    private static void findStringLength(List<String> names) {
        System.out.println("Find length of each string");
        names.stream()
                .map(str -> str + " = " + str.length())
                .forEach(System.out::println);
        System.out.println("Group the string with their length");
        Map<Integer, List<String>> map = names.stream()
                .collect(Collectors.groupingBy(String::length));
        map.forEach((k, v) -> System.out.println("Length: " + k + " String " + v));
        System.out.println();
    }

    private static void numbersAggregation(List<Integer> numbers) {
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        int min = stats.getMin();
        int max = stats.getMax();
        double avg = stats.getAverage();
        long sum = stats.getSum();
        long count = stats.getCount();

        System.out.println("Minimum " + min);
        System.out.println("Maximum " + max);
        System.out.println("Average " + avg);
        System.out.println("Sum " + sum);
        System.out.println("Count " + count);
        System.out.println();
    }

    private static void countEmployeeByExp(List<EmployeeByDeptAndExperience> employees) {
        employees.stream()
                .filter(e -> e.getExperience() > 20)
                .collect(Collectors.groupingBy(EmployeeByDeptAndExperience::getDepartment, Collectors.counting()))
                .forEach((dept, count) -> System.out.println(String.format("Department: %s, Count: %s", dept, count)));
        System.out.println();
    }

    private static void presentNumber(List<Integer> numbers, int present) {
        boolean isPresent = numbers.stream().anyMatch(num -> num == present);
        if (isPresent) System.out.println(present + " is present in the list");
        else System.out.println(present + " is not present in the list");
        System.out.println();
    }

    private static void divisibleByNumber(List<Integer> numbers, int div) {
        boolean divisible = numbers.stream().allMatch(num -> num % div == 0);
        if (divisible) System.out.println("All the numbers are divisible by " + div);
        else System.out.println("All the numbers are not divisible by " + div);
        System.out.println();
    }

    private static void commonNumbers(int[] a1, int[] a2) {
        Set<Integer> list1 = Arrays.stream(a1).boxed().collect(Collectors.toSet());
        Set<Integer> list2 = Arrays.stream(a2).boxed().collect(Collectors.toSet());

        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void containSubString(List<String> names, String sub) {
        names.stream()
                .filter(e -> e.contains(sub))
                .forEach(System.out::println);
        System.out.println();

    }

}
