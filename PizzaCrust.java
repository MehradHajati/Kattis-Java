
// Kettis, Pizza Crust

import java.util.Scanner;

public class PizzaCrust{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        double R = sc.nextInt();
        double C = sc.nextInt();
        double allpizza = Math.pow(R,2) * Math.PI;
        double inside = R - C;
        double cheese = Math.pow(inside, 2)* Math.PI;
        double answer = 100 *(cheese / allpizza);
        System.out.println(answer);

        


        

    }

}