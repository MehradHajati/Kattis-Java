// Kattis Cetiri
// https://open.kattis.com/problems/cetiri

import java.util.Scanner;
import java.util.Arrays;

public class Cetiri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1];
        if(diff == diff2){
            System.out.println(arr[2]+diff);
        }
        else if(diff2 > diff){
            System.out.println(arr[1] + diff);
        }
        else{
            System.out.println(arr[0] + diff2);
        }
    }
}