package src.main.java.org.task.cloudtech;

public class ReverseSentence {

    private static String reverse(String str) {
        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') result[i] = ' ';
        }

        int j = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                if (result[j] == ' ') j--;
                result[i] = inputArray[j];
                j--;
            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String str = "Welcome To CloudTech";
        System.out.println(reverse(str));
    }

}
