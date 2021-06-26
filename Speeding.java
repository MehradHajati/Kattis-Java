// Kattis, Speeding
// https://open.kattis.com/problems/speeding

import java.util.Scanner;

public class Speeding{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int pictures = sc.nextInt();
        int lastTime = sc.nextInt();
        int lastDistance = sc.nextInt();
        int maxSpeed = 0;
        while (pictures > 1){
            int time = sc.nextInt();
            int distance = sc.nextInt();
            if (maxSpeed < ((distance - lastDistance) / (time - lastTime))){
                maxSpeed = ((distance - lastDistance) / (time - lastTime));
            }
            lastDistance = distance;
            lastTime = time;
            pictures--;
        }
        System.out.println(maxSpeed);
    }
}