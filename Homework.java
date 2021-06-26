// Kattis, Homework
// https://open.kattis.com/problems/heimavinna

import java.util.Scanner;

public class Homework{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split(";");
        int counter = 0;
        for (int i = 0; i < input.length; i++){
            if (input[i].indexOf("-") != -1){
                int beginning = Integer.parseInt(input[i].substring(0, input[i].indexOf("-")));
                int end = Integer.parseInt(input[i].substring(input[i].indexOf("-") + 1, input[i].length()));
                counter += (end - beginning + 1);
            }
            else{
                counter++;
            }
        }
        System.out.println(counter);
    }
}