// Kattis, JudgingMoose
// https://open.kattis.com/problems/judgingmoose

import java.util.Scanner;

public class JudgingMoose{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rightside = sc.nextInt();
        int leftside = sc.nextInt();
        if (leftside >0 || rightside > 0){
            if (leftside == rightside){
                System.out.println("Even " + 2*rightside);
            }
            else{
                if (leftside > rightside){
                    System.out.println("Odd " + 2*leftside);
                }
                else{
                   if (leftside < rightside){
                    System.out.println("Odd " + 2*rightside);
                } 
                }
            }
        }
        else{
            System.out.println("Not a moose");
        }
    }
}
