// Kattis, NoDuplicate
// https://open.kattis.com/problems/nodup

import java.util.*;

public class NoDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean printed = false;
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        //System.out.println(Arrays.toString(arr));
        ArrayList<String> list = new ArrayList<String>();
        int len = arr.length;
        for (int i = 0; i < len; i++){
            if(!(list.contains(arr[i]))){
                list.add(arr[i]);
            }
            else{
                System.out.println("no");
                printed = true;
                break;
            }
        }
        if (!printed){
            System.out.println("yes");
        }
    }
}