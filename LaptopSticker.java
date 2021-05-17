// Kattis, LaptopSticker
// https://open.kattis.com/problems/laptopsticker

import java.util.*;

public class LaptopSticker{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int wc = sc.nextInt();
        int hc = sc.nextInt();
        int ws = sc.nextInt();
        int hs = sc.nextInt();
        int hdiff = hc - hs;
        int wdiff = wc - ws;
        if (hdiff > 1 && wdiff > 1){
            System.out.println("1");
        }
        else{
            System.out.println("0"); 
        }
    }
}