package src.main.java.org.task.reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindFromTextFile {

    private static void count() {

        FileReader fR = null;
        BufferedReader br = null;

        try {

            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            fR = new FileReader("D:\\new.txt");
            br = new BufferedReader(fR);
            String rL = br.readLine();

            while (rL != null) {
                lineCount++;

                String[] rlArr = rL.split(" ");
                if (!rlArr[0].isEmpty())
                    wordCount = wordCount + rlArr.length;

                for (String s : rlArr) {
                    charCount = charCount + s.length();
                }

                rL = br.readLine();
            }

            System.out.println("LINE COUNT " + lineCount);
            System.out.println("WORD COUNT " + wordCount);
            System.out.println("CHARACTER COUNT " + charCount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fR.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        count();
    }
}
