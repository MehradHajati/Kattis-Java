// Kattis, EasiestProblem
// https://open.kattis.com/problems/easiest

import java.util.*;

public class EasiestProblem{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (true){
            int number = sc.nextInt();
            if (number == 0){
                break;
            }
            else{
                int sum = sumDigits(number);
                int productSum = 0;
                int m = 10;
                while (productSum != sum){
                    m++;
                    int product = m * number;
                    productSum = sumDigits(product);
                }
                System.out.println(m);
            }
        }
    }

    public static int sumDigits(int num){
        int sumDigits = 0;
        while (num >= 10){
            sumDigits = sumDigits + (num % 10);
            num = num / 10;
        }
        sumDigits += num;
        return sumDigits;
    }
}