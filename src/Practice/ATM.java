package Practice;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        String userName,pass;
        Scanner inp = new Scanner(System.in);

        int attempts = 3, balance = 1500,price;
        int select;
        while (attempts > 0){
            System.out.print("Username = ");
            userName = inp.nextLine();
            System.out.print("Password = ");
            pass = inp.nextLine();

            if (userName.equals("aykutalp") && pass.equals("patika")){
                System.out.print("Welcome to Patika Bank");

                do {System.out.println("\n" +
                        "1-Deposit\n" +
                        "2-Withdraw\n" +
                        "3-Balance inquiry\n" +
                        "4-Exit");
                    System.out.print("Please select desired action = ");
                    select = inp.nextInt();

                    switch (select){
                        case 1 -> {System.out.print("The amount to be deposited = ");
                        price = inp.nextInt();
                        balance += price;}
                        case 2 -> {System.out.print("The amount to be withdraw = ");
                        price = inp.nextInt();
                        if (price>balance){
                            System.out.print("Insufficient balance !");
                        }else balance -= price;}
                        case 3 -> System.out.print("Money in the bank = "+balance);
                        case 4 -> System.out.println("Good Bye !");
                        default -> System.out.print("Please enter a valid value !");
                    }
                }while (select!=4);
                break;
            }else{
                attempts--;
                System.out.println("Wrong username or password, try again");

                if (attempts==0){
                    System.out.println("Your account has been blocked. Please contact customer service.");
                }else System.out.println("Remaining attempts = "+attempts);
            }
        }
    }
}
