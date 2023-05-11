package Homework;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the year = ");
        int year = inp.nextInt();

        if (year % 4 == 0){
            System.out.println("It is a leap year");
        }else System.out.println("It is not a leap year");
    }
}
