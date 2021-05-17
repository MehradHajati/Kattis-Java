// Kattis, Spavanac
// https://open.kattis.com/problems/spavanac


import java.util.Scanner; 


public class Spavanac{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (H == 0 && M < 45){
            int newH = 23;
            int newM = 60 - (45-M);
            System.out.println(newH + " " + newM);
        }
        else{
            int totaltime = H * 60 + M;
            int newtime = totaltime - 45;
            int newM = (newtime % 60);
            int newH = newtime / 60;
            System.out.println(newH + " " + newM);
        }
    }
}
