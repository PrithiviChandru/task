package src.main.java.org.task.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWordsInFile {

    private static void repeatedWordInFile() {
        BufferedReader br = null;

        try {

            Map<String, Integer> map = new HashMap<>();
            br = new BufferedReader(new FileReader("D:\\sample.txt"));
            String rL = br.readLine();

            while (rL != null) {
                String[] wArr = rL.split(" ");
                for (String s : wArr) {
                    if (!s.isEmpty()) {
                        if (map.containsKey(s)) {
                            map.put(s, map.get(s) + 1);
                        } else {
                            map.put(s, 1);
                        }
                    }
                }

                rL = br.readLine();
            }

            String word = "";
            int count = 0;
            Set<Map.Entry<String, Integer>> set = map.entrySet();
            for (Map.Entry<String, Integer> entry : set) {
                if (entry.getValue() > count) {
                    count = entry.getValue();
                    word = entry.getKey();
                }
            }

            System.out.println("REPEATED COUNT " + word + " : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        repeatedWordInFile();
    }
}
