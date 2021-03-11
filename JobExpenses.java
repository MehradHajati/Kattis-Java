//Kattis, JobExpenses

import java.util.Scanner;

public class JobExpenses{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while (N>0){
            int k = sc.nextInt();
            if (k<0){
                k = k*(-1);
                sum = sum +k;
            }
            N--;
        }
        System.out.println(sum);
    }
}