package Practice;
import java.util.Scanner;

public class harmonicSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number = ");
        double number = inp.nextDouble();
        System.out.print("Enter the value of n = ");
        int n = inp.nextInt();
        double result = 0.0;

        for (double i = 1 ; i <= n ; i++){
            result += number / i;
        }
        System.out.println(result);
    }
}