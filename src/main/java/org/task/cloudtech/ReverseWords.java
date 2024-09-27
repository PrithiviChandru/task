package src.main.java.org.task.cloudtech;

public class ReverseWords {

    public static String reverse(String str) {
        String[] sArr = str.split(" ");
        String result = "";

        for (int i = sArr.length - 1; i >= 0; i--) {
            if (i == 0) result = result + sArr[i];
            else result = result + sArr[i] + " ";
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "Welcome To CloudTech";
        System.out.println(reverse(str));
    }

}
