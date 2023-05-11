package Practice;
import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n = ");
        int number = input.nextInt();

        System.out.print("Enter the r = ");
        int rnumber = input.nextInt();

        int  n = number,r = rnumber, z = n-r,total = 1, total2 = 1,total3 = 1;

        while (!(number == 1)){
            total *= number;
            number--;
        }
        while (!(rnumber == 1)){
            total2 *= rnumber;
            rnumber--;
        }
        while (!(z == 1)){
            total3 *= z;
            z--;
        }
        System.out.println("C("+n+","+r+") = "+total / (total2 * total3));
    }
}
