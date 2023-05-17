package week1.HackerRank;

import java.util.*;

class javaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int toplam = 0;

            for (int k = 1 ; k <= n ; k++){
                int exp = 1;
                for (int z = 1; z <= k ; z++) {
                    exp *= 2;
                    if (z == 1){
                        exp = 1;
                    }
                }
                toplam += exp * b;
                System.out.print(toplam+a+" ");
            }
            System.out.println();
        }
        in.close();


    }
}