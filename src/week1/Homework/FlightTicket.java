package week1.Homework;
import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int distance,age,type;
        double amount,discAmount,total;
        System.out.print("Gideceginiz mesafeyi giriniz = ");
        distance = inp.nextInt();
        System.out.print("Yasinizi giriniz = ");
        age = inp.nextInt();
        System.out.print("1 -> Tek yon\n2 -> Gidis Donus\nYolculuk tipini seciniz = ");
        type = inp.nextInt();
        amount = distance * 0.1;
        System.out.println("Bilet ucreti = "+amount+" TL");

        if (distance<=0 || age <0 || type<1 || type>2){
            System.out.println("Hatali Veri Girdiniz !");}

        if (age<12){
            discAmount = amount * 0.5;
        } else if (age >= 12 && age <=24) {
            discAmount = amount * 0.9;
        } else if (age>65) {
            discAmount = amount * 0.7;
        } else {System.out.println("Yas indiriminiz bulunmamaktadir");
            discAmount=amount;
        }
        System.out.println("Yas indirimi ile Bilet ucreti = "+discAmount+" TL");

        if (type == 2){
            total = discAmount * 0.8;
        } else total = discAmount;

        System.out.println("Yolculuk tipine gore toplam odeme miktari = "+total+" TL");
    }
}
