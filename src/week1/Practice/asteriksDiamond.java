package week1.Practice;
import java.util.Scanner;
public class asteriksDiamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the n value = ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int blank = 1; blank <= n - i; blank++) {
                System.out.print(" ");
            }
            for (int ast = 1; ast <= 2 * i - 1; ast++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n ; i >= 1; i--) {
            for (int blank = 1; blank <= n - i; blank++) {
                System.out.print(" ");
            }
            for (int ast = 1; ast <= 2 * i - 1; ast++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}