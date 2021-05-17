// Kattis, Planina 
// https://open.kattis.com/problems/planina


import java.util.Scanner;


public class Planina{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double oneside = Math.pow(2,n) + 1;
        int oneside2 = (int)oneside;
        int total = oneside2 * oneside2;
        System.out.println(total);
    }
}
