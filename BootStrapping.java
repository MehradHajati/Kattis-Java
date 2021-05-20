// Kattis, BootStrapping
// https://open.kattis.com/problems/bootstrappingnumber

import java.util.*;

public class BootStrapping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double lower = 1;
        double upper = 10;
        while ((upper - lower) >= Math.pow(10,-6)){
            double x = (lower + upper) / 2;
            if (Math.pow(x,x) == n){
                break;
            }
            else{
                if (Math.pow(x,x) > n){
                upper = x;
                }
                else if(Math.pow(x,x) < n){
                    lower = x;
                }
            }
        }
        System.out.println(upper);
    }
}