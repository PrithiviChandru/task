package src.main.java.org.example.String;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWords {

    private static void duplicate(String str) {

        String[] strArr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            if (map.containsKey(strArr[i].toLowerCase()))
                map.put(strArr[i].toLowerCase(), map.get(strArr[i].toLowerCase()) + 1);
            else
                map.put(strArr[i].toLowerCase(), 1);
        }

        Set<String> set = map.keySet();
        for (String s : set) {
            if (map.get(s) > 1) System.out.println(s + " : " + map.get(s));
        }

    }

    public static void main(String[] args) {
        duplicate("Bread butter and bread");
        duplicate("Java is java again java");
        duplicate("Super Man Bat Man Spider Man");
    }

}
