package src.main.java.org.task.interview;

import java.util.*;
import java.util.stream.Collectors;

public class AthenaHealth {

    public static void main(String[] args) {
        System.out.println("********** SHIFTING CHARACTER **********");
        shift("naveen", 2, 4);

        System.out.println("********** GET FEATURE ORDER **********");
        featureOrder(Arrays.asList("pant", "shoe", "shirt", "clove", "shirt", "pant"));

        System.out.println("********** GET CHEAPEST COST **********");
        cheapestCost(Arrays.asList(Arrays.asList(5, 3, 9), Arrays.asList(2, 8, 4), Arrays.asList(1, 6, 7)));
    }

    private static void shift(String s, int lS, int rS) {
        int n = s.length();

        lS = lS % n;
        rS = rS % n;
        int netShifts = (n - (rS - lS)) % n;

        String start = s.substring(netShifts);
        String end = s.substring(0, netShifts);

        System.out.println(start + end);
    }

    private static void featureOrder(List<String> orders) {
        Map<String, Long> map = orders.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

        Long maxValue = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getValue();

        String result = map.entrySet().stream()
                .filter(entry -> entry.getValue() == maxValue)
                .map(m -> m.getKey())
                .sorted(Collections.reverseOrder())
                .findFirst()
                .get();

        System.out.println(orders);
        System.out.println("Feature Order: " + result);
    }

    private static void cheapestCost(List<List<Integer>> costs) {
        List<Integer> indexes = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        for (List<Integer> list : costs) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < minValue && !indexes.contains(i)) {
                    minValue = list.get(i);
                    minIndex = i;
                }
            }

            if (minValue != -1) {
                indexes.add(minIndex);
                values.add(minValue);
            }
        }

        int sum = values.stream().reduce(0, (a, b) -> a + b);
        System.out.println(values);
        System.out.println("Sum of costs " + sum);
    }

}
