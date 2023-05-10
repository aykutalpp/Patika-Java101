package Practice;
import java.util.Scanner;
import java.util.stream.Stream;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner not = new Scanner(System.in);

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
        if (Stream.of(muzik, tarih, turkce,kimya,fizik,mat).anyMatch(val -> val < 0 || val > 100)) {
            System.out.println("Girilen degerlerde hata var !");
        } else {
            // Ortalamayi hesapla ve ekrana yazdir

            double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
            System.out.println("Not ortalamanız = " + ortalama);

            // Gecti mi kaldi mi?

            String durum = ortalama >= 60 ? "Geçti" : "Kaldı";
            System.out.println(durum);
        }
    }
}

//muzik < 0 || tarih < 0 || turkce < 0 || kimya < 0 || fizik < 0 || mat < 0 ||
// muzik > 100 || tarih > 100 || turkce > 100 || kimya > 100 || fizik > 100 || mat > 100
// yazmak yerine =
// if (Stream.of(muzik, tarih, turkce,kimya,fizik,mat).anyMatch(val -> val < 0 || val > 100))
// yazdın