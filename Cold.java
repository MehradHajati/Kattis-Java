//kattis, Cold

import java.util.Scanner;

public class Cold{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int belowzero = 0;
        while (n > 0){
            int t = sc.nextInt();
            if (t < 0){
                belowzero++;
            }
            n--;
        }
        System.out.println(belowzero);
    }
}