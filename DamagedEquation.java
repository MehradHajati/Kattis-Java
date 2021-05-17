// Kattis, DamagedEquation
// https://open.kattis.com/problems/damagedequation


import java.util.*;

public class DamagedEquation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int counter = 0;

        if (a * b == c * d){
            System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + c + " " + "*" + " " + d);
            counter++;
        }
        if (a * b == c + d){
            System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + c + " " + "+" + " " + d);
            counter++;
        }
        if (a * b == c - d){
            System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + c + " " + "-" + " " + d);
            counter++;
        }
        if ((d != 0) && (a * b == c / d)) {
            System.out.println(a + " " + "*" + " " + b + " " + "=" + " " + c + " " + "/" + " " + d);
            counter++;
        }

        if (a + b == c * d){
            System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + c + " " + "*" + " " + d);
            counter++;
        }
        if (a + b == c + d){
            System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + c + " " + "+" + " " + d);
            counter++;
        }
        if (a + b == c - d){
            System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + c + " " + "-" + " " + d);
            counter++;
        }
        if ((d != 0) && (a + b == c / d)){
            System.out.println(a + " " + "+" + " " + b + " " + "=" + " " + c + " " + "/" + " " + d);
            counter++;
        }

        if (a - b == c * d){
            System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + c + " " + "*" + " " + d);
            counter++;
        }
        if (a - b == c + d){
            System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + c + " " + "+" + " " + d);
            counter++;
        }
        if (a - b == c - d){
            System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + c + " " + "-" + " " + d);
            counter++;
        }
        if ((d != 0) && (a - b == c / d)){
            System.out.println(a + " " + "-" + " " + b + " " + "=" + " " + c + " " + "/" + " " + d);
            counter++;
        }

        if ((b != 0) && (a / b == c * d)){
            System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + c + " " + "*" + " " + d);
            counter++;
        }
        if ((b != 0) && (a / b == c + d)){
            System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + c + " " + "+" + " " + d);
            counter++;
        }
        if ((b != 0) && (a / b == c - d)){
            System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + c + " " + "-" + " " + d);
            counter++;
        }
        if ((d != 0) && (b != 0) && (a / b == c / d)){
            System.out.println(a + " " + "/" + " " + b + " " + "=" + " " + c + " " + "/" + " " + d);
            counter++;
        }
        if (counter == 0){
            System.out.println("problems ahead");
        }
    }
}