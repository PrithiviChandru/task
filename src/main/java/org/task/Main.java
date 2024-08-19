package src.main.java.org.task;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String str = "welcome";

        String res = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(v -> v.getValue() == 1)
                .map(v -> v.getKey())
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(res);
    }

}
