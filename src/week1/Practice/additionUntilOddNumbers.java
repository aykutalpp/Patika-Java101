package week1.Practice;
import java.util.Scanner;

public class additionUntilOddNumbers {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        int number,total = 0;
        do {
            System.out.print("Enter the number = ");
            number = next.nextInt();

            if (number % 2 == 0 && number % 4 == 0){
                total += number;
            }
        }while (number % 2 == 0);
        System.out.println("The sum of numbers entered that are divisible by both 2 and 4 = "+total);
    }
}
