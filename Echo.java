// Kattis, Echo
// https://open.kattis.com/problems/echoechoecho

import java.util.Scanner;

public class Echo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word + " " + word + " " + word);
    }
}