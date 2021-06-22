// Kattis, Volim
// https://open.kattis.com/problems/volim

import java.util.*;

public class Volim{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int currentHolder = sc.nextInt();
        int numQuestions = sc.nextInt();
        int overallTime = 0;
        while (numQuestions > 0){
            int time = sc.nextInt();
            String answer = sc.next();
            overallTime += time;
            if (overallTime > 210){
                System.out.println(currentHolder);
                break;
            }
            if (answer.equals("T")){
                if (currentHolder == 8){
                    currentHolder = 1;
                }
                else{
                    currentHolder++;
                }
            }
            numQuestions--;
        }
    }
}