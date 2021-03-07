// Kettis, A Real Challenge

import java.util.Scanner;

public class ARealChallenge{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        long a =sc.nextLong();
        double oneside = Math.sqrt(a);
        double area= oneside * 4;
        System.out.println(area);
    }
}