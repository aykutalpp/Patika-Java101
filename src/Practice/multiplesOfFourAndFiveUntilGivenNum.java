package Practice;
import java.util.Scanner;
public class multiplesOfFourAndFiveUntilGivenNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = input.nextInt();
        int i = 1, total = 0;

        System.out.print("Multiples of 4 and 5 up to the entered number = ");
        for (i = 1;i < number; i++){
            if (i % 4 == 0 && i % 5 == 0){
                total += i;
                System.out.print(i+",");
            }
        }
        System.out.println();
        System.out.println("The sum of multiples of 4 and 5 up to the entered number = "+total);
    }
}
