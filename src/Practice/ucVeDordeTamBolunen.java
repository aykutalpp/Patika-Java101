package Practice;
import java.util.Scanner;
public class ucVeDordeTamBolunen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int counter = 0, j = 0;
        int number = inp.nextInt();

        for (int i = 0;i <= number;i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print(i+",");
                counter++;
                j += i;
            }
        }
        System.out.println();
        System.out.println("3'e ve 4'e bolunebilen sayilarin ortalamasi = "+j/counter);
    }
}
