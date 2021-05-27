// Kattis, Server
// https://open.kattis.com/problems/server

import java.util.*;

public class Server{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int minutes = sc.nextInt();
        int counter = 0;
        while (N > 0){
            minutes -= sc.nextInt();
            if (minutes >= 0){
                counter++;
            }
            N--;
        }
        System.out.println(counter);
    }
}