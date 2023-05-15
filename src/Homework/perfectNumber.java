package Homework;
import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Enter the number = ");
        int num = inp.nextInt();

        for (int i = num-1; i >=1 ; i--){
            if (num % i == 0){
                toplam += i;
            }
        }
        if (toplam == num){
            System.out.println("The number is Perfect !");
        }else System.out.println("The number is not perfect..");
    }
}
