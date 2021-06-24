// Kattis, SodaSlurper
// https://open.kattis.com/problems/sodaslurper

import java.util.*;

public class SodaSlurper{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int empty = sc.nextInt() + sc.nextInt();
        int cost = sc.nextInt();
        int drank = 0;
        while (empty >= cost){
            empty -= cost;
            drank += 1;
            empty += 1;
        }
        System.out.println(drank);
    }
}