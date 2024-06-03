package src.main.java.org.task.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AppendToTextFIle {

    private static void append() {

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter("D:\\sample.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println("Pruthiviraj C");
            pw.println();
            pw.println("Java Developer");
            pw.println("Chennai");
            pw.println("Java J2EE");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bw.close();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        append();
    }
}
