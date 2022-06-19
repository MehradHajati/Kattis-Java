import java.util.Scanner;

// Kattis, N-sum
// https://open.kattis.com/problems/nsum

public class NSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            sum += sc.nextInt();
            n--;
        }
        System.out.println(sum);
    }
}