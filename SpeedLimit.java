// Kattis, Speed Limit
// https://open.kattis.com/problems/speedlimit

import java.util.Scanner;

public class SpeedLimit{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int log = sc.nextInt();
        while(log != -1){
            int totalMiles = 0;
            int lastHour = 0;
            for(int i = 0; i < log; i++){
                int speed = sc.nextInt();
                int hour = sc.nextInt();
                totalMiles += speed * (hour - lastHour);
                lastHour = hour;
            }
            System.out.println(totalMiles + " miles");
            log = sc.nextInt();
        }
    }
}