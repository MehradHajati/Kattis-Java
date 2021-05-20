// Kattis, SimonSays
// https://open.kattis.com/problems/simonsays

import java.io.IOException;
import java.util.*;

public class SimonSays{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0){
            String input = sc.next();
            input += sc.nextLine();
            if ((input.length() > 11) && (input.substring(0,10).equals("Simon says"))){
                String output = input.substring(11);
                System.out.println(output);
            }
            N--;
        }
    }
}