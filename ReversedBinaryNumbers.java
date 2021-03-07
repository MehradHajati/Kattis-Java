//Kattis, ReversedBinaryNumbers


import java.util.Scanner;


public class ReversedBinaryNumbers{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = Integer.toBinaryString(n);
        int length = input.length();
        String output = "";
        for (int i = 1; i <= length; i++){
            output = output + input.charAt(length-i);
        }
        
        int answer = Integer.parseInt(output,2);
        System.out.println(answer);
    }
}