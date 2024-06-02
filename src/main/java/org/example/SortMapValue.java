package src.main.java.org.example;

import java.util.*;

public class SortMapValue {

    private static void sortMap() {

        Map<String, String> map = new HashMap<>();
        map.put("firstName", "c");
        map.put("middleName", "a");
        map.put("lastName", "k");

        List<Map.Entry<String, String>> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry);
        }

//        Comparator<Map.Entry<String, String>> comparator = new Comparator<Map.Entry<String, String>>() {
//            @Override
//            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        };
//        Collections.sort(list, comparator);
        Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));         // lambda expression

        Map fMap = new LinkedHashMap();
        for (Map.Entry<String, String> e : list) {
            fMap.put(e.getKey(), e.getValue());
        }

        System.out.println(fMap);

    }


    public static void main(String[] args) {
        sortMap();
    }

}
