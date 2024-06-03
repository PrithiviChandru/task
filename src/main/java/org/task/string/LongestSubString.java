package src.main.java.org.task.string;

import java.util.LinkedHashMap;

public class LongestSubString {

    private static void longestSubString(String s) {

        char[] sArr = s.toCharArray();
        String subString = null;
        int length = 0;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < sArr.length; i++) {

            char ch = sArr[i];

            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }

            if (map.size() > length) {
                length = map.size();
                subString = map.keySet().toString();
            }

        }

        System.out.println("LONGEST SUBSTRING " + subString);
        System.out.println("SUBSTRING LENGTH " + length);
    }

    public static void main(String[] args) {
        longestSubString("ABCDEFGABEF");
    }

}
