// Kattis, Filip
// https://open.kattis.com/problems/filip

import java.util.Scanner;


public class Filip{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int Adig1 = A % 10;
        A = A /10;
        int Adig2 = A % 10;
        A = A /10;
        int Adig3 = A; 

        int Bdig1 = B % 10;
        B = B /10;
        int Bdig2 = B % 10;
        B = B /10;
        int Bdig3 = B;

        String string = "";
        String newA = string.concat(Integer.toString(Adig1)).concat(Integer.toString(Adig2)).concat(Integer.toString(Adig3));
        int newintA = Integer.parseInt(newA);

        String newB = string.concat(Integer.toString(Bdig1)).concat(Integer.toString(Bdig2)).concat(Integer.toString(Bdig3));
        int newintB = Integer.parseInt(newB);
        
        if (newintB > newintA){
            System.out.println(newintB);
        }
        else{
            System.out.println(newintA);
        }
    }
}
