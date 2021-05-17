// Kattis, NastyHacks
// https://open.kattis.com/problems/nastyhacks

import java.util.Scanner;

public class NastyHacks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            int profit = e -r;
            if (c > profit){
                System.out.println("do not advertise");
            }
            else{
                if (c == profit){
                System.out.println("does not matter");
                }
                else{
                System.out.println("advertise");
                }
            }
            n--;
        }
    }
}
