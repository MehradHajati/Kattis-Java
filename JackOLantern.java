// Kattis, JackOLantern
// https://open.kattis.com/problems/jackolanternjuxtaposition

import java.util.Scanner;

public class JackOLantern{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int M = sc.nextInt();
        int answer = N*T*M;
        System.out.println(answer);
    }
}
