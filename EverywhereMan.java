
// Kattis, I've Been Everywhere, Man

import java.util.Scanner;
import java.util.ArrayList;

public class EverywhereMan{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            int n = sc.nextInt();
            ArrayList<String> cities = new ArrayList<String>();
            while (n > 0){
                String city = sc.next();
                if (!(cities.contains(city))){
                    cities.add(city);   
                }
                n--;
            }
            System.out.println(cities.size());
            T--;
        }
    }
}