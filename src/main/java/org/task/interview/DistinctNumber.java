package src.main.java.org.task.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctNumber {

    static void distinct() {

        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 4);
        Map<Integer, Long> groupBy = list.stream().collect(Collectors.groupingBy(number -> number, Collectors.counting()));
        groupBy.entrySet().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

    }

    public static void main(String[] args) {
        distinct();
    }

}
