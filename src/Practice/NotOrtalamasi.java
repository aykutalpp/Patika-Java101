package Practice;
import java.util.Scanner;
public class NotOrtalamasi {
        public static void main(String[] args) {

            int mat,fizik,kimya,turkce,tarih,muzik;
            Scanner not =new Scanner(System.in);

            // Notlari giriyoruz.
            System.out.print("Matematik notunuzu girin :");
            mat = not.nextInt();

            System.out.print("Fizik notunuzu girin :");
            fizik = not.nextInt();

            System.out.print("Kimya notunuzu girin :");
            kimya = not.nextInt();

            System.out.print("Turkce notunuzu girin :");
            turkce = not.nextInt();

            System.out.print("Tarih notunuzu girin :");
            tarih = not.nextInt();

            System.out.print("Muzik notunuzu girin :");
            muzik = not.nextInt();

            // Ortalamayi hesapla ve ekrana yazdir

            double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
            System.out.println("Not ortalamanız = "+ortalama);

            // Gecti mi kaldi mi?

            String durum = ortalama>=60?"Geçti" : "Kaldı";
            System.out.println(durum);
        }
    }
