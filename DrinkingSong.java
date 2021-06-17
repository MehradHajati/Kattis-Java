// Kattis, DrinkingSong
// https://open.kattis.com/problems/drinkingsong

import java.util.Scanner;

public class DrinkingSong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String liquad = sc.next();
        while (N > 0){
            if (N > 2){
                System.out.println(N + " bottles of " + liquad + " on the wall, " + N + " bottles of " + liquad + ".");
                System.out.println("Take one down, pass it around, " + (N-1) + " bottles of " + liquad + " on the wall.");
                System.out.println();
            }
            else{
                if (N == 2){
                    System.out.println(2 + " bottles of " + liquad + " on the wall, " + 2 + " bottles of " + liquad + ".");
                    System.out.println("Take one down, pass it around, " + 1 + " bottle of " + liquad + " on the wall.");
                    System.out.println();
                }
                else{
                    if (N == 1){
                        System.out.println(1 + " bottle of " + liquad + " on the wall, " + 1 + " bottle of " + liquad + ".");
                        System.out.println("Take it down, pass it around, no more bottles of " + liquad + "."); 
                    }
                }
            }
            N--;
        }
    }
}