// Kattis, ForcedChoice
// https://open.kattis.com/problems/forcedchoice

import java.util.*;

public class ForcedChoice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int specialCard = sc.nextInt();
        int S = sc.nextInt();
        for (int i = 0; i < S; i++){
            int m = sc.nextInt();
            boolean check = false;
            for (int b = 0; b < m; b++){
                int num = sc.nextInt();
                if (num == specialCard){
                   check = true;
                }
            }
            if (check){
                System.out.println("KEEP");
            }
            else{
                System.out.println("REMOVE");
            }
        }
    }
}