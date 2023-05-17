package week1.HackerRank;
import java.io.*;

public class javaLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number N = ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        for (int i = 1 ; i <=10 ; i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }
    }
}
