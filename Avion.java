//Kattis, Avion
// https://open.kattis.com/problems/avion

import java.util.Scanner;

public class Avion{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int blimps = 0;
        for (int i = 1; i <= 5; i++){
            String input = sc.next();
            int length = input.length();
            for (int b = 2; b < length; b++){
                if (input.charAt(b-2) == 'F' && input.charAt(b-1) == 'B' && input.charAt(b) == 'I'){
                    System.out.println(i);
                    blimps = blimps +1;
                }
            }
        }
        if (blimps == 0){
            System.out.println("HE GOT AWAY!");
        }
    }
}
