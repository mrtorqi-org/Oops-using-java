import java.io.IOException;
import java.util.Scanner;

class MyException extends Exception {
    public MyException(String str) {
        System.out.println(str);
    }
}

public class SignException {
    public static void main(String args[]) {
        System.out.println("Enter number of input number:");
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int k = 0, sum = 0;
        int Mynumbers[] = new int[n];
       
        System.out.println("Enter numbers:");
       
        while (n > 0) {
            try {
                int num = sc.nextInt();
                if (num < 0) {
                    throw new MyException("Number is negative");
                } else {
                    Mynumbers[k] = num;
                    sum = sum + num;
                    k++;
                }
                n--;
            } catch (MyException m) {
                System.out.println(m);
            }
        }
       
        if (k > 0) {
            System.out.println("The average is " + (double) sum / k);
        } else {
            System.out.println("No positive numbers were entered.");
        }
    }
}
