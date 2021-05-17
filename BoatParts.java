// Kattis, BoatParts
// https://open.kattis.com/problems/boatparts

import java.util.*;

public class BoatParts{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 1; i <= N; i++){
            String part = sc.next();

            if (!(list.contains(part))){
                list.add(part);
            }

            if (list.size() == P){
                System.out.println(i);
                break;
            }

        }

        if (list.size() < P){
            System.out.println("paradox avoided");
        }
            
    }
}