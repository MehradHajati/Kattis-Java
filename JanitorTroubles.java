// Kattis, JanitorTroubles
// https://open.kattis.com/problems/janitortroubles

import java.io.*;
import java.util.Scanner;
 
public class JanitorTroubles{

    static double maxArea(double a, double b, double c, double d){
        double semiperimeter = (a + b + c + d) / 2;
        return Math.sqrt((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c) * (semiperimeter - d));
    }
     
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println(maxArea(a, b, c, d));
    }
}