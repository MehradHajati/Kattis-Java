// Kattis, HeartRate

import java.util.Scanner;

public class HeartRate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N>0){
            int beats = sc.nextInt();
            double p = sc.nextDouble();
            System.out.println(((beats-1)* 60) / p);
            System.out.println((beats* 60) / p);
            System.out.println(((beats+1)* 60) / p);
            N--;
        }
    }
}