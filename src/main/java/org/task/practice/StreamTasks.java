package src.main.java.org.task.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTasks extends Object {

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

}
