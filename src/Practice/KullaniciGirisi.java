package Practice;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String id, pass, select, newpass;
        System.out.print("Kullanici adi giriniz = ");
        id = inp.nextLine();
        System.out.print("Sifre giriniz = ");
        pass = inp.nextLine();

        if (id.equals("aykutalp") && pass.equals("patika123")) {
            System.out.println("Basariyla giris yaptiniz !");
        } else if (pass.equals("patika123") && !id.equals("aykutalp")) {
            System.out.println("Kullanici adi gecersiz !");
        } else if (id.equals("aykutalp") && !pass.equals("patika123")) {
            System.out.println("Yanlis sifre ! \nYeni sifre olusturmak ister misiniz ? (Y/N)");
            select = inp.nextLine();
            if (select.equals("Y")||select.equals("y")) {
                System.out.print("Yeni sifrenizi giriniz = ");
                newpass = inp.nextLine();
                if (newpass.equals("patika123")) {
                    System.out.println("Yeni sifreniz, eski sifreniz ile ayni olamaz !");
                } else {
                    System.out.println("Yeni sifreniz basariyla olusturuldu !");
                }
            } else {
                System.out.println("Program kapatiliyor..");
            }
        } else {
            System.out.println("Girilen bilgiler yanlis !");
        }
    }
}