package week1.Practice;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        // Kullanıcıdan para degeri girmesini iste.
        System.out.print("KDV hesabi icin para değerini giriniz = ");
        Scanner inp = new Scanner(System.in);
        double deger = inp.nextDouble();
        System.out.println("Para degeri ="+deger);

        if (deger<=1000 || deger>0){
            double kdv = 1.18;
            System.out.println("KDV Tutari = "+((deger*kdv)-deger));
            System.out.println("KDV'li fiyat = "+ deger*kdv);
            System.out.println("KDV'siz fiyat = "+ deger);
        }else {
            double kdv = 1.08;
            System.out.println("KDV Tutari = "+((deger*kdv)-deger));
            System.out.println("KDV'li fiyat = "+ deger*kdv);
            System.out.println("KDV'siz fiyat = "+ deger);
        }
    }
}
