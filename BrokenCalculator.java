// Kattis, BrokenCalculator
// https://open.kattis.com/problems/brokencalculator

import java.util.Scanner;

public class BrokenCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long lastResult = 1;
        while (N > 0){
            long firstNumber = sc.nextLong();
            String operand = sc.next();
            long secondNumber = sc.nextLong();
            if (operand.equals("+")){
                long actualOperation = firstNumber + secondNumber;
                long falseOperation = actualOperation - lastResult;
                System.out.println(falseOperation);
                lastResult = falseOperation;
            }
            if (operand.equals("*")){
                long actualOperation = firstNumber * secondNumber;
                long falseOperation = actualOperation * actualOperation;
                System.out.println(falseOperation);
                lastResult = falseOperation;
            }
            if (operand.equals("/")){
                if (firstNumber % 2 == 0){
                    long falseOperation = firstNumber / 2;
                    System.out.println(falseOperation);
                    lastResult = falseOperation;
                }
                else{
                    long falseOperation = (firstNumber + 1) / 2; 
                    System.out.println(falseOperation);
                    lastResult = falseOperation;
                } 
            }
            if (operand.equals("-")){
                long actualOperation = firstNumber - secondNumber;
                long falseOperation = actualOperation * lastResult;
                System.out.println(falseOperation);
                lastResult = falseOperation;
            }
            N--;
        }
    }
}