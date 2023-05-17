package week2.Practice;
import java.util.Scanner;
public class recursiveExponent {
    public static int expo(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * expo(a, b - 1);
        }
    }

    public static void main(String[] args) {
        while (true) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Base number = ");
            int a = inp.nextInt();
            System.out.print("Exponent number = ");
            int b = inp.nextInt();
            System.out.println("Result = " + expo(a, b));
        }
    }
}