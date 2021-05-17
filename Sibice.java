// Kattis, Sibice
// https://open.kattis.com/problems/sibice

import java.util.Scanner;

public class Sibice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        double maxlength = Math.sqrt(w*w+ h*h);
        while (n>0){
            int length = sc.nextInt();
            if (maxlength >= length){
                System.out.println("DA");
            }
            else{
                System.out.println("NE");
            }
            n--;
        }
    }
}
