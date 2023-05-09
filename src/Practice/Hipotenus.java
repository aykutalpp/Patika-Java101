package Practice;
import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a,b,c,u,cevre,alan;

        //a ve b kenarlari girilir
        System.out.print("a kenari uzunlugunu giriniz = ");
        a = inp.nextDouble();
        System.out.print("b kenari uzunlugunu giriniz = ");
        b = inp.nextDouble();

        // c degeri, cevre, alan ve cevrenin yarisi olan u degeri hesaplanıp ekrana yazdirilir.
        c = Math.sqrt((a*a)+(b*b));
        u = (a+b+c)/2;
        cevre = u*2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("c kenari uzunlugu = "+c);
        System.out.println("Ucgenin Cevresi = "+cevre);
        System.out.println("Ucgenin alani = "+alan);

    }
}
