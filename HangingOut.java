// Kattis, HangingOut
// https://open.kattis.com/problems/hangingout


import java.util.Scanner;


public class HangingOut{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        int current = 0;
        while (n>0){
            String action = sc.next();
            int p = sc.nextInt();
            if (action.charAt(0) == 'e'){
                if ((current + p) <= max){
                    current = current + p;
                }
                else{
                    answer = answer + 1;
                }
            } 

            if (action.charAt(0) == 'l'){
                current = current -p;
            }
            n--;
        }
        System.out.println(answer);
    }
}
