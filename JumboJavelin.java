// Kattis, JumboJavelin
// https://open.kattis.com/problems/jumbojavelin

import java.util.*;


public class JumboJavelin {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int combinedLength = 0;
        for (int i = 0; i < N; i++){
            int length = sc.nextInt();
            combinedLength += length;
        }
        combinedLength -= (N-1);
        System.out.println(combinedLength);
    }
}
