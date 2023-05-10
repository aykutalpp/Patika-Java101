package Practice;
import java.util.Scanner;

public class UcSayiyiSirala {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;

        System.out.print("a sayisini girin = ");
        a = inp.nextInt();
        System.out.print("b sayisini girin = ");
        b = inp.nextInt();
        System.out.print("c sayisini girin = ");
        c = inp.nextInt();
        System.out.print("Sayilarin kucukten buyuge siralamasi = ");
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            } else System.out.println("a < c < b");

        }else if (b < a && b < c){
            if (a < c) {
                System.out.println("b < a < c");
        }   else
                System.out.println("b < c < a");
        }else
            if (a < b){
                System.out.println("c < a < b");
            } else
                System.out.println("c < b < a");
    }
}
