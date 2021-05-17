// Kattis, Stopwatch 
// https://open.kattis.com/problems/stopwatch

import java.util.*;

public class Stopwatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int time = 0;
        if (N % 2 == 0){
            for (int i = 0; i < N/2; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                time = time + (b-a);
            }
            System.out.println(time);
        }
        else{
            System.out.println("still running");
        }
    }
}