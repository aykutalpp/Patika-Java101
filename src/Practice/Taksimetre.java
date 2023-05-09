package Practice;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double km,tkmtutar,total = 10.0, min = 20.0, kmprice = 2.20;

        //Kullanicidan km yi alip hesaplama yap ve ekrana yansit
        System.out.print("Km giriniz = ");
        km = girdi.nextDouble();
        tkmtutar = km * kmprice;
        total = total + tkmtutar;
        total = (total < min) ? min : total;

        System.out.println("Odeme miktari = "+total+" TL");
    }
}
