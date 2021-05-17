// Kattis, TreasureHunt
// https://open.kattis.com/problems/treasurehunt

import java.util.*;

public class TreasureHunt {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        char[][] board = new char[rows][columns];
        for (int i = 0; i < rows; i++){
            String input = sc.next();
            for (int j = 0; j < columns; j++){
                board[i][j] = input.charAt(j);
            }
        }
        boolean[][] visited = new boolean[rows][columns];
        int rowLocation = 0; 
        int columnLocation = 0;
        int movesCounter = 0;
        try{
            while (!(board[rowLocation][columnLocation] == 'T')){
                if (visited[rowLocation][columnLocation]){
                    System.out.println("Lost");
                    System.exit(0);
                }
                else{
                    visited[rowLocation][columnLocation] = true;
                    if (board[rowLocation][columnLocation] == 'W'){
                        movesCounter++; 
                        columnLocation--;
                    }
                    if (board[rowLocation][columnLocation] == 'E'){
                        movesCounter++; 
                        columnLocation++;
                    }
                    if (board[rowLocation][columnLocation] == 'S'){
                        movesCounter++; 
                        rowLocation++;
                    }
                    if (board[rowLocation][columnLocation] == 'N'){
                        movesCounter++; 
                        rowLocation--;
                    }
                }
            }
            System.out.println(movesCounter);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out");
            System.exit(0);
        }
    }
}
