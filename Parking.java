// Kattis, Parking
// https://open.kattis.com/problems/parking

import java.util.Scanner;

public class Parking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = 2*sc.nextInt();
        int C = 3*sc.nextInt();
        int money = 0;
        int arrivalt1 = sc.nextInt();
        int departuret1 = sc.nextInt();
        int arrivalt2 = sc.nextInt();
        int departuret2 = sc.nextInt();
        int arrivalt3 = sc.nextInt();
        int departuret3 = sc.nextInt();
        int latest = 0;
        if (departuret1 > latest){
            latest = departuret1;
        }
        if (departuret2 > latest){
            latest = departuret2;
        }
        if (departuret3 > latest){
            latest = departuret3;
        }
        for (int i = 1; i <=latest; i++){
            int numberoftrucks = 0;
            if (( arrivalt1 < i) && (departuret1 >= i)){
                numberoftrucks = numberoftrucks +1; 
            }
            if (( arrivalt2 < i) && (departuret2 >= i)){
                numberoftrucks = numberoftrucks +1; 
            }
            if (( arrivalt3 < i) && (departuret3 >= i)){
                numberoftrucks = numberoftrucks +1; 
            }
            if (numberoftrucks == 1){
                money = money + A;
            }
            else{
                if (numberoftrucks == 2){
                    money = money + B;
                }
                else{
                    if (numberoftrucks == 3){
                        money = money + C;
                    }
                }
            }
        }
        System.out.println(money);
    }
}
