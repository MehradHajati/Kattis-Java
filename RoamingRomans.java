//Kattis, RoamingRomans

import java.util.Scanner;

public class RoamingRomans{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double answer = x * 1000 * 5280 / 4854;
        int answer2 = (int) Math.round(answer);

        System.out.println(answer2);
    }
}