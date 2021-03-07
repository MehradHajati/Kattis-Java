// Kattis, SevenWonders

import java.util.Scanner;

public class SevenWonders{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int numsT = 0;
        int numsC = 0;
        int numsG = 0;
        int length = input.length();
        for (int i = 0; i < length; i++){
            if (input.charAt(i) == 'T'){
                numsT += 1;
            }

            if (input.charAt(i) == 'C'){
                numsC += 1;
            }

            if (input.charAt(i) == 'G'){
                numsG += 1;
            }
        }

        int lowest = numsT;
        if (lowest > numsG){
            lowest = numsG;
        }

        if (lowest > numsC){
            lowest = numsC;
        }

        double answer = Math.pow(numsT, 2) + Math.pow(numsC, 2) + Math.pow(numsG, 2) + (7 * lowest);
        int points = (int) answer;
        System.out.println(points);

    }
}