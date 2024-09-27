package src.main.java.org.task.cloudtech;

public class CountWord {

    public static int count(String str, String word) {
        int count = 0;
        String[] sArr = str.split(" ");

        for (int i = 0; i < sArr.length; i++)
            if (sArr[i].equals(word)) count++;
        return count;
    }

    public static void main(String[] args) {
        String str = "welcome to CloudTech and CloudTech is good channel to learn programming";
        String word = "CloudTech";
        System.out.println("Word Count " + count(str, word));
    }

}
