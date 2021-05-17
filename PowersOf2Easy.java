// Kattis, PowersOf2Easy
// https://open.kattis.com/problems/powersof2easy

import java.util.*;

public class PowersOf2Easy{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int k = 0;
        double exponent2 = Math.pow(2, e);
        String stringOfPower2 = Integer.toString((int)exponent2);
        for(int i = 1; i<= n; i++){
            String numberIntoString = Integer.toString(i);
            if (numberIntoString.contains(stringOfPower2)){
                k++;
            }
        }
        System.out.println(k);
    }
}