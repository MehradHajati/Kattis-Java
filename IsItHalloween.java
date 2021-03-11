//Kattis, IsItHalloween

import java.util.Scanner;

public class IsItHalloween{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int day = sc.nextInt();
        if (((month.charAt(0) == 'O') && (day == 31)) || ((month.charAt(0) == 'D') && (day == 25)) ){
            System.out.println("yup");
        }
        else{
            System.out.println("nope");
        }
    }
}