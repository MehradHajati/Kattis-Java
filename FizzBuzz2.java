// Kattis, FizzBuzz 2
// https://open.kattis.com/problems/fizzbuzz2

import java.util.*;

public class FizzBuzz2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numCandidates = sc.nextInt();
        int values = sc.nextInt();
        sc.nextLine();
        int[] mistakes = new int[numCandidates];
        for (int i = 0; i < numCandidates; i++){
            String[] answer = sc.nextLine().split(" ");
            for (int j = 0; j < values; j++){
                if (!(formula(j+1).equals(answer[j]))){
                    mistakes[i]++;
                }
            }
        }
        int lowest = 1000;
        int position = -1;
        for (int i = 0; i < numCandidates; i++){
            if (mistakes[i] < lowest){
                lowest = mistakes[i];
                position = i;
            }
        }
        System.out.println(position+1);
    }

    public static String formula (int number){
        if ((number % 3 == 0) && (number % 5 == 0)){
            return "fizzbuzz";
        }
        else{
            if (number % 3 == 0){
                return "fizz";
            }
            else{
                if (number % 5 ==0){
                    return "buzz";
                }
                else{
                    return ("" + number);
                }
            }
        }
    }
}