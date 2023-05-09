package Practice;
import java.util.Scanner;
public class DaireAlanVeCevre {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r,alan,cevre,dilim,dilimalani;

        System.out.print("Dairenin yaricapini giriniz = ");
        r = inp.nextDouble();
        cevre = 2.0 * Math.PI * r;
        alan = Math.PI * r * r;

        System.out.println("Dairenin yaricapi = "+r);
        System.out.println("Dairenin cevresi = "+cevre);
        System.out.println("Dairenin alani = "+alan);

        System.out.print("Alanini bulmak istediginiz daire diliminin acisini giriniz = ");
        dilim = inp.nextDouble();
        dilimalani = (alan * dilim) / 360.0;
        System.out.println(dilim+" derecelik daire diliminin alani = "+dilimalani);
    }
}
