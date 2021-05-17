// Kattis, Harshad Numbers
// https://open.kattis.com/problems/harshadnumbers

import java.util.Scanner;

public class HarshadNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while (answer == 0){
            int n2 = n;
            int sumofDigs = 0;
            int n3 = n2;
            while (n2 > 0){
                sumofDigs = sumofDigs + (n2 % 10);
                n2 = n2/10;
            }
            if (n3 % sumofDigs == 0){
                answer = n3;
            }
            n = n +1;
        }
        System.out.println(answer);
    }
}
