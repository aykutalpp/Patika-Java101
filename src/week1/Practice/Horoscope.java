package week1.Practice;
import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day, month;
        System.out.print("Dogdugunuz gunu giriniz = ");
        day = inp.nextInt();
        System.out.print("Dogdugunuz ayi giriniz = ");
        month = inp.nextInt();

        if (month < 1 || month > 12 || day < 1 || day > 31)
            System.out.println("Gecersiz bir deger girdiniz");
        else 
            System.out.print("Burcunuz = ");
            if (month == 1) {
                if (day < 22) System.out.println("Oğlak");
                else System.out.println("Kova");}

            if (month == 2){
                if (day < 20) System.out.println("Kova");
                else System.out.println("Balik");}

            if (month == 3){
                if (day < 21) System.out.println("Balık");
                else System.out.println("Koç");}

            if (month == 4){
                if (day < 21) System.out.println("Koç");
                else System.out.println("Boğa");}

            if (month == 5){
                if (day < 21) System.out.println("Boğa");
                else System.out.println("İkizler");}

            if (month == 6) {
                if (day < 23) System.out.println("İkizler");
                else System.out.println("Yengeç");}

            if (month == 7) {
                if (day < 23) System.out.println("Yengeç");
                else System.out.println("Aslan");}

            if (month == 8) {
                if (day < 22) System.out.println("Aslan");
                else System.out.println("Basak");}

            if (month == 9) {
                if (day < 23) System.out.println("Basak");
                else System.out.println("Terazi");}

            if (month == 10) {
                if (day < 23) System.out.println("Terazi");
                else System.out.println("Akrep");}

            if (month == 11) {
                if (day < 22) System.out.println("Akrep");
                else System.out.println("Yay");}

            if (month == 12) {
                if (day < 22) System.out.println("Yay");
                else System.out.println("Oğlak");}

    }
}
