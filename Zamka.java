//kattis, Zamka

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Zamka{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        List<Integer> good = new ArrayList<Integer>();

        while (D >= L){
            int L2 = L;
            int sum = 0;
            while (L2 > 0){
                int rightmostdigit = L2 % 10;
                sum = sum +rightmostdigit;
                L2 = L2 /10;

            }
            if (sum == X){
                good.add(L);
            }
            L=L+1;
        }
        int N = good.get(0);
        int size = (good.size()-1);
        int M = good.get(size);
        System.out.println(N);
        System.out.println(M);
    }
}