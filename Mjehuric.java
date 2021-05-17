// Kattis, Mjehuric
// https://open.kattis.com/problems/mjehuric

import java.util.*;

public class Mjehuric{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] list = new int[5];
        int [] correctList = {1,2,3,4,5};

        for(int i = 0; i < 5; i++){
            list[i] = sc.nextInt();
        }   
        

        while (!(Arrays.equals(list,correctList))){
            for (int i = 0; i<4; i++){
                if (list[i] > list[i+1]){
                    int current = list[i+1];
                    list[i+1] = list[i];
                    list[i] = current;
                    System.out.println(list[0] + " " +list[1] + " " + list[2] + " " + list[3] + " " + list[4]);
                }
            }
        }
        
    }
}