package week1.Practice;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select, a, b;
        //islem yapilacak sayilari kullanicidan iste
        System.out.print("İslem yapacaginiz ilk sayiyi girin = ");
        a = inp.nextInt();
        System.out.print("İslem yapacaginiz ikinci sayiyi girin = ");
        b = inp.nextInt();
        // Yapilacak islem turunu kullanicidan iste
        System.out.print("1- Toplama \n2- Cikarma \n3- Carpma \n4- Bolme \nYapmak istediginiz islemi secin = ");
        select = inp.nextInt();
        // Hesaplayip ekrana yazdir, eger 1 ile 4 arasinda secim yapilmazsa hata mesaji ver
        if (select > 0 && select < 5) {
            switch (select) {
                case 1 -> System.out.println("Secilen sayilarin toplami = " + (a + b));
                case 2 -> System.out.println("Secilen sayilarin cikarimi = " + (a - b));
                case 3 -> System.out.println("Secilen sayilarin carpimi = " + (a * b));
                case 4 -> {
                    if (b == 0)
                        System.out.println("Bir sayi 0'a bolunemez");
                    else
                        System.out.println("Secilen sayilarin bolumu = " + (a / b));
                }
            }
        } else {
            System.out.println("Gecerli bir islem girilmedi");
        }
    }
}
