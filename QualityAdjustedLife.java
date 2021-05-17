// Kattis, QualityAdjustedLife
// https://open.kattis.com/problems/qaly

import java.util.Scanner;

public class QualityAdjustedLife{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double QALY = 0;
        while (N>0){
            double q = sc.nextDouble();
            //System.out.println(q);
            double y = sc.nextDouble();
            //System.out.println(y);
            QALY = QALY + (q*y);
            N--;
        }
        System.out.println(QALY);
    }
}
