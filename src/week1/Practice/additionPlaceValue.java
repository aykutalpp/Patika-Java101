package week1.Practice;
import java.util.Scanner;

public class additionPlaceValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = input.nextInt();
        int placeValue = 0, total = 0, tempNumber = number;

        while (tempNumber != 0){
            placeValue = tempNumber % 10;
            tempNumber /= 10;
            total += placeValue;
        }
        System.out.println(number+"'s addition of place values is = "+total);
    }
}
