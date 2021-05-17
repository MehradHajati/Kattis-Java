// Kattis, Chanukah
// https://open.kattis.com/problems/chanukah

import java.util.Scanner;

public class Chanukah{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while (P > 0){
            int K = sc.nextInt();
            int N = sc.nextInt();
            int total = 0;
            for (int i = 1; i <= N; i++){
                total = total + i;
            }
            total = total + N;
            System.out.println(K + " " + total);
            P--;
        }
    }
}
