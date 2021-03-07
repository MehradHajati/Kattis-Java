//Kattis, BatterUp

import java.util.Scanner;

public class BatterUp{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double atBats = sc.nextInt();
        double n = atBats;
        double total = 0;

        for (int i = 0; i < n; i++){
            int bases = sc.nextInt();
            if (bases == (-1)){
                atBats = atBats - 1;
            }
            else {
                total = total + bases;

            }
        }

        double answer = total / atBats;
        System.out.println(answer);
    }
}