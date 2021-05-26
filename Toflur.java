// Kattis, Toflur
// https://open.kattis.com/problems/toflur

import java.util.*;

public class Toflur{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int [] arr = new int[N];
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        long output = 0;
        for (int i = 0; i < (N-1); i++){
            output += Math.pow(arr[i]- arr[i+1], 2);
        }
        System.out.println(output);
    }
}