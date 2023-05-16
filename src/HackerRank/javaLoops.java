package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
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
