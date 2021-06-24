// Kattis, ClosingTheLoop
// https://open.kattis.com/problems/closingtheloop

import java.util.*;

public class ClosingTheLoop{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int j = 1; j <= cases; j++){
            int numRopes = sc.nextInt();
            ArrayList<Integer> blue = new ArrayList<Integer>();
            ArrayList<Integer> red = new ArrayList<Integer>();
            for (int i = 0; i < numRopes; i++){
                String rope = sc.next();
                if (rope.charAt(rope.length() -1) == 'B'){
                    blue.add(Integer.parseInt(rope.substring(0, rope.length()-1)));
                }
                else{
                    red.add(Integer.parseInt(rope.substring(0, rope.length()-1)));
                }
            }
            Collections.sort(blue);
            Collections.sort(red);
            int numKnots = 0;
            int length = 0;
            if (red.size() > blue.size()){
                while ((red.size() > 0) && (blue.size() > 0)){
                    length += red.get(red.size()-1);
                    red.remove(red.size()-1);
                    length += blue.get(blue.size()-1);
                    blue.remove(blue.size()-1);
                    numKnots += 2;
                }
            }
            else{
                while ((red.size() > 0) && (blue.size() > 0)){
                    length += blue.get(blue.size()-1);
                    blue.remove(blue.size()-1);
                    length += red.get(red.size()-1);
                    red.remove(red.size()-1);
                    numKnots += 2;
                }
            }
            System.out.println("Case #" + j + ": " + (length - numKnots));
        }
    }
}