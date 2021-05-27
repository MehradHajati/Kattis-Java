// Kattis, HelpAPhD
// https://open.kattis.com/problems/helpaphd

import java.util.Scanner;

public class HelpAPhd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N>0){
            String input = sc.next();
            if (input.charAt(0) == 'P'){
                System.out.println("skipped");
            }
            else{
                String[] arr = input.split("\\+");
                System.out.println( Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            }
            N--;
        }
    }
}