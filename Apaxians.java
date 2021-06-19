// Kattis, Apaxians
// https://open.kattis.com/problems/apaxiaaans

import java.util.*;

public class Apaxians{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int length = input.length();
        String output = "";
        output += input.charAt(0);
        for (int i = 1; i < length; i++){
            char lastchar = output.charAt(output.length()-1);
            if (lastchar != input.charAt(i)){
                output += input.charAt(i);
            }
        }
        System.out.println(output);
    }
}