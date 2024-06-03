package src.main.java.org.task.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortFromFile {

    public static void main(String[] args) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader(new FileReader("D:\\input.txt"));
            String rL = br.readLine();

            List<String> list = new ArrayList<>();
            while (rL != null) {
                list.add(rL);
                rL = br.readLine();
            }

            Collections.sort(list);

            bw = new BufferedWriter(new FileWriter("D:\\output.txt"));
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{

                br.close();
                bw.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
