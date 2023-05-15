package Homework;
import java.util.Scanner;
public class maxAndMinInputs {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max,min,value;
        System.out.print("Number of numbers to be entered = ");
        int num = inp.nextInt();
        if (num >=1) {
            System.out.print("1.Number is = ");
            max = inp.nextInt();
            min = max;
            for (int i = 2; i <= num; i++) {
                System.out.print(i + ".Number is = ");
                value = inp.nextInt();

                if (value >= max) {
                    max = value;
                }
                if (value <= min) {
                    min = value;
                }
            }
            System.out.println("Maximum number is = " + max);
            System.out.println("Minimum number is = " + min);
        }else System.out.println("Number should be bigger than zero !");
    }
}