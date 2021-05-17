// Kattis, ShatteredCake
// https://open.kattis.com/problems/shatteredcake

import java.util.Scanner;

public class ShatteredCake{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int area = 0;
        int W = sc.nextInt();
        int N = sc.nextInt();
        while (N > 0){
            int Wi = sc.nextInt();
            int Li = sc.nextInt();
            area = area + (Wi*Li);
            N--; 
        }
        int L = area / W;
        System.out.println(L);
    }
}
