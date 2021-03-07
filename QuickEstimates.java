//Kattis, QuickEstimates

import java.util.Scanner;

public class QuickEstimates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int magnitude = 1; 
        while (N>0){
            String b = sc.next();
            int length = b.length();
            System.out.println(length);
            N--;
        }
    }
}