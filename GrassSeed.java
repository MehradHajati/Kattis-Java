// Kattis, GrassSeed
// https://open.kattis.com/problems/grassseed

import java.util.Scanner;
import java.text.NumberFormat;

public class GrassSeed{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        int L = sc.nextInt();
        double area = 0;
        while (L > 0){
            double w = sc.nextDouble();
            double l = sc.nextDouble();
            area = area + (l*w);
            L--;
        }
        
        double money = area * C;
        System.out.println(money);

    }
}
