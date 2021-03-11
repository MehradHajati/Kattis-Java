//Kattis, LicenseToLaunch

import java.util.*;

public class LicenseToLaunch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int lowest = 1000000000;
        ArrayList<Integer> list = new ArrayList<Integer> ();
        while (N>0){
            int junk = sc.nextInt();
            list.add(junk);
            if (junk < lowest){
                lowest = junk;
            }
            N--;
        }
        System.out.println(list.indexOf(lowest));
    }
}