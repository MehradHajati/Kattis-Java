// Kattis, EstimateAreaCircle
// https://open.kattis.com/problems/estimatingtheareaofacircle

import java.util.*;

public class EstimateAreaCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            double radius = sc.nextDouble();
            double totalpoints = sc.nextDouble();
            double pointsinside = sc.nextDouble();
            if (radius == 0){
                break;
            }
            else{
                System.out.println((radius * radius * Math.PI) + " " + ((pointsinside / totalpoints) * (radius * radius * 4)));
            }

        }
    }
}