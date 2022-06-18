// Kattis, CD
// https://open.kattis.com/problems/cd

import java.util.Scanner;
import java.util.HashSet;

public class CD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jack = sc.nextInt();
        int jill = sc.nextInt();
        HashSet<Integer> jackCD = new HashSet<Integer>();
        while(jack > 0 || jill > 0){
            for(int i = 0; i < jack; i++){
                jackCD.add(sc.nextInt());
            }
            int counter = 0;
            for(int i = 0; i < jill; i++){
                if(jackCD.contains(sc.nextInt())){
                    counter++;
                }
            }
            System.out.println(counter);
            jack = sc.nextInt();
            jill = sc.nextInt();
            jackCD.clear();
        }
        sc.close();
    }
}
