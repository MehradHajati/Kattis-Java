// Kattis, MagicTrick
// https://open.kattis.com/problems/magictrick

import java.util.*;

public class MagicTrick{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean printed = false;
        String input = sc.next();
        ArrayList<Character> letters = new ArrayList<Character>();
        int len = input.length();
        for (int i = 0; i < len; i++){
            if (!(letters.contains(input.charAt(i)))){
                letters.add(input.charAt(i));
            }
            else{
                System.out.println("0");
                printed = true;
                break;
            }
        }
        if (!printed){
            System.out.println("1");
        }
    }
}