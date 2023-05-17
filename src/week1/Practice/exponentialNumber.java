package week1.Practice;
import java.util.Scanner;

public class exponentialNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number n = ");
        int n = inp.nextInt();
        int nValue = n;
        System.out.print("Enter the exponent of n = ");
        int r = inp.nextInt();


        for (int i = 1; i < r; i++){
            n *= nValue;
        }
        System.out.println("Result is = "+n);
    }
}
