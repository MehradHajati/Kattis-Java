// Kattis, LineThemUp
// https://open.kattis.com/problems/lineup


import java.util.*;


public class LineThemUp{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] list = new String[N];

        for (int i = 0; i < N; i++){
            String name = sc.next();
            list[i] = name;
        }
        
        String [] sortedList = Arrays.copyOf(list, N);
        Arrays.sort(sortedList);
        

        String [] reverseList = Arrays.copyOf(list, N);
        
        for(int i = 0; i < N; i++){
            reverseList[i] = sortedList[N-1-i];
        }



        if (Arrays.equals(list, reverseList)){
           System.out.println("DECREASING");
        }
        else{
            if (Arrays.equals(list, sortedList)){
                System.out.println("INCREASING");
            }
            else{
                System.out.println("NEITHER");
            }
        }
        

    
    }
}