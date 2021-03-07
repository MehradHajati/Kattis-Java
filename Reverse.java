//Kattis, Reverse

import java.util.*;

public class Reverse{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            int b = sc.nextInt();
            numbers.add(b);
            
        }
        for (int c = (n-1); c >= 0; c--){ 
            System.out.println(numbers.get(c));
        }
    }
}