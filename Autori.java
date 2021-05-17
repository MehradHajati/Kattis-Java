// kattis, Autori
// https://open.kattis.com/problems/autori

import java.util.Scanner;

public class Autori{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        int size = input.length();
        // location within the string
        int location = 0;
        while (size > location){
            if (Character.isUpperCase(input.charAt(location)) == true){
                output += input.charAt(location);
            }
            location++;
        }
        System.out.println(output);
    }
}
