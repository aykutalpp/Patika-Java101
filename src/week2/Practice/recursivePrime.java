package week2.Practice;
import java.util.Scanner;

public class recursivePrime {
    static boolean isPrime(int n, int i)
    {
        // Base cases
        if (n <= 1)
            return false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = inp.nextInt();

        System.out.println(isPrime(n,2));

    }
}
