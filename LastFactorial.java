// Kattis, LastFactorial
// https://open.kattis.com/problems/lastfactorialdigit

import java.util.Scanner;

public class LastFactorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            int N = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= N; i++){
                factorial = factorial*i;
            }
            int lastdigit = factorial % 10;
            T--;
            System.out.println(lastdigit);
        }
    }
}
