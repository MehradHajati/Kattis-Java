//Kattis, Greetings

import java.util.Scanner;

public class Greetings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        int numofEs= 2*(length - 2);
        /*for (int i = 0; i < length; i++){
            if (input.charAt(i) == 'e'){
                numofEs = numofEs +2;
            }
        }*/
        String e = "";
        for (int i = 0; i < numofEs; i++){
            e = e + "e";

        }
        System.out.println("h" + e + "y");
    }
}