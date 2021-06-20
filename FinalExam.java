// Kattis, FinalExam
// https://open.kattis.com/problems/finalexam2

import java.util.*;

public class FinalExam{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int N = sc.nextInt();
        String lastQ = sc.next();
        String currQ = "";
        for (int i = 0; i < (N-1); i++){
            currQ = sc.next();
            if (lastQ.equals(currQ)){
                counter++;
            }
            lastQ = currQ;
        }
        System.out.println(counter);
    }
}