// Kattis, CyrptoConundrum
// https://open.kattis.com/problems/conundrum

import java.util.*;

public class CryptoConundrum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int length = input.length();
        int numdays = length;
        for (int i = 0; i < length; i+=3){
            if (input.charAt(i) == 'P'){ 
                numdays--;
            }
            if (input.charAt(i+1) == 'E'){
                numdays--;
            }
            if (input.charAt(i+2) == 'R'){
                numdays--;
            }
        }
        System.out.println(numdays);
    }
}