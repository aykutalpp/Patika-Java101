package week1.Homework;
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy, kilo, endeks;

        //Kullanıcıdan boy ve kilo degerini alip endeksi hesaplayip ekrana yazdir
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lutfen kilonuzu (kg cinsinde) giriniz : ");
        kilo = inp.nextDouble();

        endeks = kilo / (boy * boy);
        System.out.println("Vucut kitle endeksiniz = "+endeks+" kg/m²");
    }
}
