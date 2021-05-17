// Kattis, Bela
// https://open.kattis.com/problems/bela

import java.util.Scanner;

public class Bela{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = 4*sc.nextInt();
        char dominant = sc.next().charAt(0);
        int points = 0;
        while (N>0){
            String card = sc.next();

            if (card.charAt(0) == 'A'){
                points = points + 11;
            }

            if (card.charAt(0) == 'K'){
                points = points + 4;
            }

            if (card.charAt(0) == 'Q'){
                points = points + 3;
            }

            if (card.charAt(0) == 'T'){
                points = points + 10;
            }

            if (card.charAt(0) == 'J'){
                if (card.charAt(1) == dominant){
                    points = points + 20;
                }
                else {
                    points = points + 2;
                }
            }

            if ((card.charAt(0) == '9') && (card.charAt(1) == dominant)){
                points = points + 14;
            }

            N--;
        }
        System.out.println(points);
    }
}
