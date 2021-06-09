// Kattis, Rijeci
// https://open.kattis.com/problems/rijeci

import java.util.Scanner;

public class Rijec{

    public static int Fibonacci(int n){
        double Phi = 1.618033988749894;
        double phi = -0.618033988749894; 
        int nth = ((int)((Math.pow(Phi, n) - Math.pow(phi, n)) / Math.sqrt(5))) + 1;
        return nth;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k > 1){
            System.out.println(Fibonacci(k-1) + " " + Fibonacci(k));
        }
        else{
            System.out.println("0 1");
        }
    }
}