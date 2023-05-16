package Homework;
public class primeNumber {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 2; i<=100 ; i++){
            toplam = 0;
            for (int k = i ; k >= 1 ; k--){
                if (i % k == 0 ) {
                    toplam += k;
                }
                if (toplam == i + 1){
                    System.out.print(i+" ");
                }
            }
        }
    }
}

/*
 for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

this code is better
 */
