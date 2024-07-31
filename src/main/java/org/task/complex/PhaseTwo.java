package src.main.java.org.task.complex;

public class PhaseTwo {

    public static void main(String[] args) {

        PhaseTwo pT = new PhaseTwo();

        System.out.println("********** SWAPPING TWO NUMBERS **********");
        pT.swapTwoNumbers(200, 100);

        System.out.println("********** ARMSTRONG NUMBER **********");
        pT.armstrongNumber(153);

    }

    /**
     * input : a = 100, b = 200
     * output : a = 200, b = 100
     */
    private void swapTwoNumbers(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("SWAPPING " + a + " AND " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("SWAPPING " + a + " AND " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("SWAPPING " + a + " AND " + b);

    }

    /**
     * input : 153
     * output : ARMSTRONG NUMBER
     */
    private void armstrongNumber(int num) {

        int sum = 0, temp, res;
        temp = num;

        while (num > 0) {
            res = num % 10;
            num = num / 10;
            sum = sum + (res * res * res);
        }

        if (temp == sum) System.out.println(temp + " IS AN ARMSTRONG NUMBER");
        else System.out.println(temp + " IS NOT AN ARMSTRONG NUMBER");

    }

}
