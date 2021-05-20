// Kattis, HonourThy
// https://open.kattis.com/problems/apaxianparent

import java.util.*;

public class HonourThy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String y = sc.next();
        String p = sc.next();
        int len = y.length();
        if ((y.charAt(len-1) == 'a') || (y.charAt(len-1) == 'i') || (y.charAt(len-1) == 'o') || (y.charAt(len-1) == 'u') || (y.charAt(len-1) == 'e')){
            if (y.charAt(len-1) == 'e'){
                System.out.println(y + "x" + p);
            }
            else{
                y = y.substring(0, len-1);
                System.out.println(y + "ex" + p);
            }
        }
        else{
            if ((y.charAt(len-1) == 'x') && (y.charAt(len-2) == 'e')){
                System.out.println(y + p);
            }
            else{
                System.out.println(y + "ex" + p);
            }
        }
    }
}