// Kattis, Ladder
// https://open.kattis.com/problems/ladder


import java.util.Scanner;
import java.lang.Math;

public class Ladder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        double radV = Math.toRadians(v);
        double sinV = Math.sin(radV);
        double minlength = h/sinV;
        int length = (int) (minlength);
        System.out.println(length +1);
    }
}
