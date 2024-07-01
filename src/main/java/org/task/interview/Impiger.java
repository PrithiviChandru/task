package src.main.java.org.task.interview;

import java.util.*;
import java.util.stream.Collectors;

public class Impiger {

    private static void distinct(String str) {

        char[] sArr = str.replaceAll("\\s", "").toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            char c = sArr[i];
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > 1) System.out.println("DUPLICATE " + m.getKey() + " : " + m.getValue());
        }

    }

    private static void secondHighest(Integer[] numbers) {

        List<Integer> numList = Arrays.asList(numbers);
        Collections.sort(numList);

        int length = numList.size() - 2;
        System.out.println(numList.get(length));

    }

    private static void evenNumbers() {
        List<Integer> numbers = Arrays.asList(3, 6, 2, 5, 8, 10);
        List<Integer> list = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void main(String[] args) {
        distinct("level");

        Integer[] a = {2, 4, 3, 5, 1};
        secondHighest(a);

        evenNumbers();
    }

}
