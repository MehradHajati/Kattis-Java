// Kattis, Tarifa

import java.util.Scanner;

public class Tarifa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = N * X;
        while (N > 0){
            int MonthUsage = sc.nextInt();
            total = total - MonthUsage;
            N--;
        }
        total = total + X;
        System.out.println(total);
    }
}