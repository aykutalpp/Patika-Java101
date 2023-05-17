package week1.Homework;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        System.out.println("Hello yegenim kac kilo vereyim?");
        double armut,elma,domates,muz,patlican,total;
        double armutp = 2.14,elmap = 3.67,domatesp = 1.11 ,muzp = 0.95,patlicanp = 5;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut = ");
        armut = inp.nextDouble();

        System.out.print("Elma = ");
        elma = inp.nextDouble();

        System.out.print("Domates = ");
        domates = inp.nextDouble();

        System.out.print("Muz = ");
        muz = inp.nextDouble();

        System.out.print("Patlican = ");
        patlican = inp.nextDouble();

        total= (armut*armutp)+(elma*elmap)+(domates*domatesp)+(muz*muzp)+(patlican*patlicanp);
        System.out.println("Toplam Tutar = "+total+" TL");
    }
}
