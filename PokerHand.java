// Kattis, PokerHand
// https://open.kattis.com/problems/pokerhand


import java.util.*;


public class PokerHand{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[13];
        for (int i = 0; i < 5; i++){
            char hand = sc.next().charAt(0);
            if (hand == 'A'){
                arr[0]++;
            }
            if (hand == '2'){
                arr[1]++;
            }
            if (hand == '3'){
                arr[2]++;
            }
            if (hand == '4'){
                arr[3]++;
            }
            if (hand == '5'){
                arr[4]++;
            }
            if (hand == '6'){
                arr[5]++;
            }
            if (hand == '7'){
                arr[6]++;
            }
            if (hand == '8'){
                arr[7]++;
            }
            if (hand == '9'){
                arr[8]++;
            }
            if (hand == 'T'){
                arr[9]++;
            }
            if (hand == 'J'){
                arr[10]++;
            }
            if (hand == 'Q'){
                arr[11]++;
            }
            if (hand == 'K'){
                arr[12]++;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[12]);
        
    }
}