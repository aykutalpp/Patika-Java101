package Practice;
import java.util.Scanner;
/*
                      space     asteriks
    *        i = 1      4          1
   ***       i = 2      3          3
  *****      i = 3      2          5
 *******     i = 4      1          7
*********    i = 5      0          9

            n = 5      n-i      n + n -1
 */

public class asteriksTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the n value = ");
        int n = inp.nextInt();
        int nTemp = n, blank, ast;

        for (int i = 1; i <= n; i++) {
            for (blank = 1 ; blank <= (n - i) ; blank++) {
                System.out.print(" ");
            }
            for (ast = 1; ast <= i+i-1; ast++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}