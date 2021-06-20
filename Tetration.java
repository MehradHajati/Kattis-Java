// Kattis, Tetration
// https://open.kattis.com/problems/tetration

import java.util.*;

public class Tetration{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        System.out.println(Math.pow(number, (1 / number)));
    }
}