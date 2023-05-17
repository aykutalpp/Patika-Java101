package week2.Practice;
import java.util.Scanner;
public class advancedCalculator {
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        return a/b;
    }
    static int power(int a,int b){
        int result = 1;
        for (int i = 1 ; i <=b; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a%b;
    }
    static void rectangle(int a,int b){
        System.out.println("Area = "+ a*b);
        System.out.println("Perimeter = "+2*(a+b));
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select,a , b ;

        String menu = "1- Addition operation\n" +
                "2- Subtraction operation\n" +
                "3- Multiplication operation\n" +
                "4- Division operation\n" +
                "5- Exponentiation operation\n" +
                "6- Modulo operation\n" +
                "7- Rectangle area and perimeter calculation\n" +
                "0- Exit";

        while (true){
            System.out.println(menu);
            System.out.print("Please select an option : ");
            select = inp.nextInt();

            if (select == 0){
                break;
            }
            System.out.print("Please enter FİRST number : ");
            a = inp.nextInt();
            System.out.print("Please enter SECOND number : ");
            b = inp.nextInt();

            switch (select){
                case 1 -> System.out.println("Result = "+sum(a , b));
                case 2 -> System.out.println("Result = "+sub(a , b));
                case 3 -> System.out.println("Result = "+multiply(a , b));
                case 4 -> System.out.println("Result = "+divide(a , b));
                case 5 -> System.out.println("Result = "+power(a , b));
                case 6 -> System.out.println("Result = "+mod(a , b));
                case 7 -> rectangle(a,b);
            }
        }
        System.out.println("Good bye ..");
    }
}
