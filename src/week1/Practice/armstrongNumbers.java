package week1.Practice;
import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = inp.nextInt();
        int numOfDigits = 0, tempNumber = number;
        int placeValue, armValue = 0, result;

        while ((tempNumber != 0)) {
            tempNumber /= 10;
            numOfDigits++;
        }

        tempNumber = number;
        while (tempNumber != 0){
            placeValue = tempNumber % 10;
            tempNumber /= 10;
            result = 1;
            for (int i = 1; i <= numOfDigits; i++){
                result *= placeValue;
            }
            armValue += result;
        }
        if (number == armValue) {
            System.out.println("The number is armstrong number ! \n" + number + " = " + armValue);
        } else System.out.println("İt's not an armstrong number ! \n" + number + " != " + armValue);
    }
}
        // Basamak sayisini bul, basamaklari bul, üssünü al