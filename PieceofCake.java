// Kattis, PieceofCake
// https://open.kattis.com/problems/pieceofcake2

import java.util.Scanner;

public class PieceofCake{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        int maxPiece = h * v;
        int testPiece = (side-h) * (side - v);
        if (testPiece > maxPiece){
            maxPiece = testPiece;
        }
        testPiece = (side - v) * h;
        if (testPiece > maxPiece){
            maxPiece = testPiece;
        }
        testPiece = (side - h) * v;
        if (testPiece > maxPiece){
            maxPiece = testPiece;
        }
        int maxPieceVolume = maxPiece * 4;
        System.out.println(maxPieceVolume);
    }
}
