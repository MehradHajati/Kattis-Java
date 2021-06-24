// kattis, Arrangement
// https://open.kattis.com/problems/upprodun

import java.util.Scanner;

public class Arrangement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int teams = sc.nextInt();
        int remainder = teams % rooms;
        int divisible = (teams - remainder) / rooms;
        for (int j = 1; j <= (remainder); j++){
        printSymbol(divisible + 1);
        }
        for (int j = 1; j <= (rooms - remainder); j++){
        printSymbol(divisible);
        }
    }

    public static void printSymbol(int number){
        for (int i = 1; i <=number; i++){
            System.out.print("*"); 
        }
        System.out.println();
    }
}