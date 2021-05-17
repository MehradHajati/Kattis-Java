// Kattis, ABC
// https://open.kattis.com/problems/abc


import java.util.*;

public class ABC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        String order = sc.next();
        int [] array = {first, second, third};
        Arrays.sort(array);
        int A = array[0];
        int B = array[1];
        int C = array[2];
        for (int i = 0; i<3; i++){
            char current = order.charAt(i);
            if (current == 'A'){
                System.out.print(A + " ");
            }
            if (current == 'B'){
                System.out.print(B + " ");
            }
            if (current == 'C'){
                System.out.print(C + " ");
            }
        }
    }
}