//Kattis, Hiss

import java.util.Scanner;

public class Hiss{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean hissorNo = false;
        int length = input.length();
        for (int i = 0; (i+1) < length; i++){
            if ((input.charAt(i) == 's') && (input.charAt(i+1) == 's')){
                hissorNo = true;  
            }
        }

        if (hissorNo){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
    }
}