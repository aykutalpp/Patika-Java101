package Practice;
import java.util.Scanner;

public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Merhaba ! \nEtkinlik önerisi icin hava sicakligini giriniz = ");
        int heat = inp.nextInt();

        if (heat<5)                 System.out.println("Kayak yapmaya gidebilirsin.");
        if (heat >=5 && heat <=15)  System.out.println("Sinemaya gidebilirsin.");
        if (heat >=10 && heat <=25) System.out.println("Piknik yapmaya gidebilirsin.");
        if (heat >25)               System.out.println("Yüzmeye gidebilirsin.");

        System.out.println("İyi eğlenceler !");
    }
}
