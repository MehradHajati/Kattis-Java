// Kattis, Trik
// https://open.kattis.com/problems/trik

import java.util.Scanner;

public class Trik{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        int length = input.length();
        // not size,just which character of string we are at
        int size = 0;
        int ball = 1;

        while (size < length){

            if ((input.charAt(size) == 'A') & (ball == 1)){
                ball = 2;
            }
            else{
                if ((input.charAt(size) == 'A') & (ball == 2)){ 
                    ball = 1;
                }
                else{
                    if ((input.charAt(size) == 'B') & (ball == 2)){
                        ball = 3;
                    }
                    else{
                        if ((input.charAt(size) == 'B') & (ball == 3)){
                            ball = 2;
                        }
                        else{
                            if ((input.charAt(size) == 'C') & (ball == 3)){
                                ball = 1;
                            }
                            else{
                                if ((input.charAt(size) == 'C') & (ball == 1)){
                                    ball = 3;
                                }
                            }
                        }
                    }
                }
            }
            size++;
        }
        System.out.println(ball);
    }
}
