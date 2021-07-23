// Kattis, Grandpas Checkerboard
// https://open.kattis.com/problems/thisaintyourgrandpascheckerboard

import java.util.Scanner;

public class GrandpasCheckerboard{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean[][] board = new boolean[size][size];
        for(int i = 0; i < size; i++){
            String row = sc.next();
            for (int j = 0; j < size; j++){
                if( row.charAt(j) == 'W'){
                    board[i][j] = true;
                }
            }
        }
        if (columnCheck(board) && rowCheck(board)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }


    public static boolean columnCheck(boolean[][] board){
        int size = board.length;
        for (int j = 0; j < size; j++){
            boolean lastSpot = board[0][j];
            int counter = 0;
            int black = 0;
            int white = 0;
            for (int i = 0; i < size; i++){
                if(board[i][j] == lastSpot){
                    counter++;
                }
                else{
                    counter = 1;
                }
                if(counter >= 3){
                    return false;
                }
                lastSpot = board[i][j];
                if(board[i][j]){
                    white++;
                }
                else{
                    black++;
                }
            }
            if (white != black){
                return false;
            }
        }
        return true;
    }


    public static boolean rowCheck(boolean[][] board){
        int size = board.length;
        for (int i = 0; i < size; i++){
            boolean lastSpot = board[i][0];
            int counter = 0;
            int black = 0;
            int white = 0;
            for (int j = 0; j < size; j++){
                if(board[i][j] == lastSpot){
                    counter++;
                }
                else{
                    counter = 1;
                }
                if(counter >= 3){
                    return false;
                }
                lastSpot = board[i][j];
                if(board[i][j]){
                    white++;
                }
                else{
                    black++;
                }
            }
            if (white != black){
                return false;
            }
        }
        return true;
    }


}