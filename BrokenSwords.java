// Kattis, BrokenSwords
// https://open.kattis.com/problems/BrokenSwords

import java.util.*;

public class BrokenSwords{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int topBot = 0;
        int leftRight = 0;
        int numSwords = sc.nextInt();
        int newSwords = 0;
        while (numSwords > 0){
            String sword = sc.next();
            if (sword.charAt(0) == '0'){
                topBot++;
            }
            if (sword.charAt(1) == '0'){
                topBot++;
            }
            if (sword.charAt(2) == '0'){
                leftRight++;
            }
            if (sword.charAt(3) == '0'){
                leftRight++;
            }
            numSwords--;
        }
        while ((leftRight >= 2) && (topBot >= 2)){
            leftRight = leftRight - 2;
            topBot = topBot - 2;
            newSwords++;
        }
        System.out.println(newSwords + " " + topBot + " " + leftRight);
    }
}