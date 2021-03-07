//Kattis, OddManOut

import java.util.Scanner;
import java.util.ArrayList;

public class OddManOut{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int b = 1; b <= N; b++){
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            int G = sc.nextInt();
            for (int i = 1; i <= G; i++){
                int C = sc.nextInt();
                if (!(numbers.contains(C))){
                    numbers.add(C);
                }
                else{
                    int position = numbers.indexOf(C);
                    numbers.remove(position);
                }
            }
            System.out.println("Case #"+ b + ": " + numbers.get(0));
        }
    }
}