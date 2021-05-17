// Kattis, ElectricalOutlets
// https://open.kattis.com/problems/electricaloutlets

import java.util.Scanner;

public class ElectricalOutlets{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // number of test cases
        int N = sc.nextInt();
        while (N > 0){
            // variable to count the available free outlets
            int totaloutlets = 0;
            // number of power strips
            int K = sc.nextInt();
            while (K > 0){
                // number of outlets in each power strip
                int outlets = sc.nextInt();
                outlets = outlets -1;
                totaloutlets = outlets + totaloutlets;
                K--;
            }
            totaloutlets = totaloutlets + 1;
            System.out.println(totaloutlets);
            N--;
        }
    }
}
