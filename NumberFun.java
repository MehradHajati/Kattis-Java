//Kattis, NumberFun

import java.util.Scanner;

public class NumberFun{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N>0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if ((a+b == c) || (a-b == c) || (b-a == c) || (a/b == c) || (b/a == c) || (a*b == c)){
                System.out.println("Possible");
            }
            else{
                System.out.println("Impossible");
            }
            N--;
        }
    }
}