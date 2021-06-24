// Kattis, EarlyWinter
// https://open.kattis.com/problems/earlywinter

import java.util.Scanner;

public class EarlyWinter{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean printed= false;
        int years = sc.nextInt();
        int thisYear = sc.nextInt();
        for (int i = 0; i < years; i++){
            if ( sc.nextInt() <= thisYear){
                printed = true;
                System.out.println("It hadn't snowed this early in " + i + " years!");
                break;
            }
        }
        if (!printed){
            System.out.println("It had never snowed this early!");
        }
    }
}