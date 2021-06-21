// Kattis, TripleTexting
// https://open.kattis.com/problems/tripletexting

import java.util.*;

public class TripleTexting{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int length = (input.length())/3;
        String output = "";
        for (int i = 0; i < length; i++){
            if (input.charAt(i) == input.charAt(i+length)){
                output += input.charAt(i);
            }
            else{
                output += input.charAt(i + (2 * length));
            }
        }
        System.out.println(output);
    }
}