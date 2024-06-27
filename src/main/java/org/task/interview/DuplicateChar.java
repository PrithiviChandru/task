package src.main.java.org.task.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

    static void duplicate(String str) {

        String s = str.replaceAll("\\s", "").toLowerCase();
        char[] sArr = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {

            char c = sArr[i];

            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);

        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> m : set) {
            if (m.getValue() > 1) System.out.println(m.getKey() + " : " + m.getValue());
        }

    }

    public static void main(String[] args) {
        duplicate("Kaspon articles are Awesome");
    }

}
