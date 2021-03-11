//Kattis, Modulo

import java.util.*;

public class Modulo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<10; i++){
            int number = sc.nextInt();
            int remainder = number % 42;
            if (!(list.contains(remainder))){
                list.add(remainder);
            }
        }
        System.out.println(list.size());
    }
}