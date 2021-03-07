//Kattis, Bijele

import java.util.Scanner;

public class Bijele{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numKings = sc.nextInt();
        int numQueens = sc.nextInt();
        int numRooks = sc.nextInt();
        int numBishops = sc.nextInt();
        int numKnights = sc.nextInt();
        int numPawns = sc.nextInt();

        int kings = 1 - numKings;
        int queens = 1 - numQueens;
        int rooks = 2 - numRooks;
        int bishops = 2 - numBishops;
        int knights = 2 - numKnights; 
        int pawns = 8 - numPawns;
        
        System.out.println(kings + " " + queens + " " + rooks + " " + bishops + " " + knights + " " + pawns);
    }
}