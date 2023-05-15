// Greatest Common Divisor - Least Common Multiple
package Practice;
import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int first, second, gdc, lcm, i;
        System.out.println("First value should be lower than second !");
        do {
            System.out.print("First value = ");
            first = inp.nextInt();
            System.out.print("Second value = ");
            second = inp.nextInt();

            if (first < second) {
                int k = first;
                while (k >= 1) {
                    if (first % k == 0 && second % k == 0) {
                        gdc = k;
                        System.out.println("GCD = " + gdc);
                        break;
                        }
                    k--;
                    }
                i = 1;
                while (i <= (first * second)){
                    if (i % first == 0 && i % second == 0) {
                        lcm = i;
                        System.out.println("LCM = " + lcm);
                        break;
                    }
                    i++;
                }
            }
        }while (first < second) ;
        System.out.println("First number should be lower !");
    }
}