package Homework;
import java.util.Scanner;

/*
*******        0       7  2 (n - i) + 1
 *****         1       5
  ***          2       3
   *           3       1             num = 4
*/
public class asteriksTriangleReverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = inp.nextInt();

        for (int i=1 ; i <= num; i++){
            for (int x = 1 ; x <= (i-1) ; x++){
                System.out.print(" ");
            }
            for (int y =1 ; y <= 2 * (num - i) + 1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
