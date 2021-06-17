// Kattis, Alloys
// https://open.kattis.com/problems/alloys

import java.util.Scanner;

public class Alloys{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float price = sc.nextFloat();
        if (price > 1){
            System.out.println("0.25");
        }
        else{
            System.out.println(Math.pow(price/2, 2));
        }
    }
}