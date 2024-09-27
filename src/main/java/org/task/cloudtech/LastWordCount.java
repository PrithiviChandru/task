package src.main.java.org.task.cloudtech;

public class LastWordCount {

    public static int count(String str) {
        int count = 0;
        str = str.trim();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') break;
            count++;
        }

        // Shortcut
        String[] sArr = str.trim().split(" ");
        System.out.println(sArr[sArr.length - 1] + " : " + sArr[sArr.length - 1].length());

        return count;
    }

    public static void main(String[] args) {
        String str = "Welcome To CloudTech";
        System.out.println(count(str));
    }
}
