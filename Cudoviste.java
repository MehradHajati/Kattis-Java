// Kattis, Cudoviste
// https://open.kattis.com/problems/cudoviste

import java.util.*;

public class Cudoviste{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numrows = sc.nextInt();
        int numcolumns = sc.nextInt();
        char [][] map = new char [numrows][numcolumns];
        for(int i = 0; i < numrows; i++){
            String row = sc.next();
            for (int j = 0; j < numcolumns; j++){
                map[i][j] = row.charAt(j);
            }
        }
        int zeroCars = 0;
        int oneCar = 0;
        int twoCars = 0;
        int threeCars = 0;
        int fourCars = 0;
        for (int i = 0; i < (numrows-1); i++){
            for (int j = 0; j < (numcolumns-1); j++){
                if (map[i][j] != '#'){
                    int numcars = 0;
                    if ((map[i+1][j] != '#') && (map[i][j+1] != '#') && (map[i+1][j+1] != '#')){
                        if (map[i][j] == 'X'){
                            numcars += 1;
                        }
                        if (map[i+1][j] == 'X'){
                            numcars += 1;
                        }
                        if (map[i][j+1] == 'X'){
                            numcars += 1;
                        }
                        if (map[i+1][j+1] == 'X'){
                            numcars += 1;
                        }
                        if (numcars == 0){
                            zeroCars += 1;
                        }
                        if (numcars == 1){
                            oneCar += 1;
                        }
                        if (numcars == 2){
                            twoCars += 1;
                        }
                        if (numcars == 3){
                            threeCars += 1;
                        }
                        if (numcars == 4){
                            fourCars += 1;
                        }
                    }
                    
                }
            }
        }
        System.out.println(zeroCars);
        System.out.println(oneCar);
        System.out.println(twoCars);
        System.out.println(threeCars);
        System.out.println(fourCars);
    }
}