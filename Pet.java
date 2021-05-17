// Kattis, Pet
// https://open.kattis.com/problems/pet

import java.util.Scanner;

public class Pet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int winner = 0;
        int number = 0;
        int grade1 = 0;
        for (int i = 1;i <= 5; i++) { 
            grade1 = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
            if (grade1 > winner) {
                winner = grade1;
                number = i;
            }
        }
        System.out.println(number);
        System.out.println(winner);
    }
}
