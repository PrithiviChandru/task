package src.main.java.org.task.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonNumbers {

    private static void commonNumbersByLoop(int[] num1, int[] num2) {
        List<Integer> list = new ArrayList<>();
        for (int i : num1) {
            for (int j : num2) {
                if (i == j && !list.contains(i)) list.add(i);
            }
        }

        list.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    private static void commonNumbersBySet(int[] num1, int[] num2) {
        Set<Integer> set = new HashSet<>();
        for (int i : num1) {
            set.add(i);
        }

        Set<Integer> res = new HashSet<>();
        for (int j : num2) {
            if (set.contains(j)) res.add(j);
        }

        res.forEach(v -> System.out.print(v + " "));
        System.out.println();
    }

    private static void commonNumbersByStream(int[] num1, int[] num2) {
        Set<Integer> arr1 = Arrays.stream(num1).boxed().collect(Collectors.toSet());
        Stream<Integer> arr2 = Arrays.stream(num2).boxed();

        List<Integer> res = arr2.filter(arr1::contains).distinct().collect(Collectors.toList());
        res.forEach(v -> System.out.print(v + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 3, 2};
        int[] b = {7, 6, 5, 4, 3, 5, 4};

        System.out.println("************ By Loop ************");
        commonNumbersByLoop(a, b);

        System.out.println("************ By Set ************");
        commonNumbersBySet(a, b);

        System.out.println("************ By Stream ************");
        commonNumbersByStream(a, b);
    }

}
