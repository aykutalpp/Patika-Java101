package week1.Homework;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = input.nextInt();
        System.out.println("There's "+n+" fibonacci numbers :");
        int first = 0;
        int second = 1;
        int next;
        System.out.print(first + " " + second + " ");

        for (int i = 1; i <= n - 2 ; i++){
            next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
    }
}
