// Kattis, HumanCannonball
// https://open.kattis.com/problems/humancannonball2


import java.util.Scanner;


public class HumanCannonball{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N > 0){
            double v = sc.nextDouble();
            double angle = sc.nextDouble();
            double x = sc.nextDouble();
            double h1 = sc.nextDouble();
            double h2 = sc.nextDouble();
            double radians = Math.toRadians(angle);
            // time when he reaches the wall
            double T = x / (v * Math.cos(radians));
            // his Y position at time T
            double y  = v * T * Math.sin(radians) - 0.5 * 9.81 * Math.pow(T, 2);
            if ((y > (h1 +1)) && (y < (h2 -1))){
                System.out.println("Safe");
            }
            else{
               System.out.println("Not Safe"); 
            }
            N--;
        }
    }
}
