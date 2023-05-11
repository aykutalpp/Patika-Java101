package Practice;
import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n = ");
        int nNumber = input.nextInt();

        System.out.print("Enter the r = ");
        int rNumber = input.nextInt();

        int  n = nNumber,r = rNumber, z = n-r,nFac = 1, rFac = 1,nMinusRFac = 1;

        while (!(nNumber == 1)){
            nFac *= nNumber;
            nNumber--;
        }
        while (!(rNumber == 1)){
            rFac *= rNumber;
            rNumber--;
        }
        while (!(z == 1)){
            nMinusRFac *= z;
            z--;
        }
        System.out.println("C("+n+","+r+") = "+nFac / (rFac * nMinusRFac));
    }
}
