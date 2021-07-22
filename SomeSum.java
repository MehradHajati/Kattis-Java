// Kattis, SomeSum
// https://open.kattis.com/problems/somesum

import java.util.Scanner;

public class SomeSum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 1){
            System.out.println("Either");
        }
        else{
            if((number / 2) % 2 == 1){
                System.out.println("Odd");
            }
            else{
                System.out.println("Even");
            }
        }
    }
}