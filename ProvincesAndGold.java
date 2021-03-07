// Kattis, Provinces and Gold

import java.util.Scanner;

public class ProvincesAndGold{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int gold = sc.nextInt();
        int silver = sc.nextInt();
        int copper = sc.nextInt();
        int totalpoints = (3*gold + 2*silver + copper);

        if (totalpoints >= 8){
            System.out.println("Province or Gold");
        }
        else{
            if (totalpoints >= 6){
                System.out.println("Duchy or Gold");
            }
            else{
                if (totalpoints >= 5){
                    System.out.println("Duchy or Silver");
                }
                else{
                    if (totalpoints >= 3){
                        System.out.println("Estate or Silver");
                    }
                    else{
                        if (totalpoints >= 2){
                            System.out.println("Estate or Copper");
                        }
                        else{
                            System.out.println("Copper");
                        }
                    }
                }
            }
        }
    }
}