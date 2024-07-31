package src.main.java.org.task.interview;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {

    private static void missingNumber(List<Integer> list) {

        int n = list.size() + 1;
        int eSum = 0;
        int sum = 0;

        eSum = (n * (list.get(0) + list.get(list.size() - 1))) / 2;     // ARITHMETIC SERIES SUM FORMULA : (n * (first + last)) /2

        for (int i : list) {
            sum += i;
        }

        int mNum = eSum - sum;
        System.out.println("MISSING NUMBER " + mNum);

    }

    public static void main(String[] args) {
        missingNumber(Arrays.asList(121, 122, 124, 125, 126));
    }

}
