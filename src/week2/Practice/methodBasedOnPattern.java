package week2.Practice;
import java.util.Scanner;

public class methodBasedOnPattern {

    static int patern (int num,int con, int temp){
        if (con == 1) {
            num = num - 5;
            System.out.print(num + " ");
            if (num < 1){
                con += 1;
            }
        }
        if (con == 2){
            num = num + 5;
            System.out.print(num+" ");
            if (num == temp){
                return 0;
            }
        }

        return patern(num,con,temp);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int con = 1;
        System.out.print("Enter the number = ");
        int num = inp.nextInt();
        boolean b = num > 0 ? con == 1 : con == 2;
        int temp = num;
        System.out.print(num+" ");
        patern(num,con,temp);
    }
}
