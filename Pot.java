// Kattis, Pot
// https://open.kattis.com/problems/pot

import java.util.Scanner;

public class Pot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        while (N>0){
            int P = sc.nextInt();
            int lastdig = P % 10;
            P = P/10;
            int P1 = (int) Math.pow(P, lastdig);
            answer = answer + P1;
            N--;
        }
        System.out.println(answer);
    }
}
