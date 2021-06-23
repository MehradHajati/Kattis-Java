// Kattis, OddGnome
// https://open.kattis.com/problems/oddgnome

import java.util.*;

public class OddGnome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0){
            int groupSize = sc.nextInt();
            int [] group = new int[groupSize];
            for (int i = 0; i < groupSize; i++){
                group[i] = sc.nextInt();
            }
            for (int i = 1; i < (groupSize-1); i++){
                if (group[i-1] != (group[i]-1)){
                    System.out.println(i+1);
                    break;
                }
            }
            N--;
        }
    }
}