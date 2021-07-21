// Kattis, Statistics
// https://open.kattis.com/problems/statistics

import java.util.Scanner;

public class Statistics{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while(sc.hasNextInt()){
            int dataSize = sc.nextInt();
            int min = 1000000; 
            int max = -1000000;
            for (int i = 0; i < dataSize; i++){
                int data = sc.nextInt();
                if (min > data){
                    min = data;
                }
                if (max < data){
                    max = data;
                }
            }
            System.out.println("Case " + counter + ": " + min + " " + max + " " + (max-min));
            counter++;
        }
    }
}