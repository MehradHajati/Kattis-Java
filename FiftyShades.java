// Kattis, FiftyShades
// https://open.kattis.com/problems/fiftyshades

import java.util.*;

public class FiftyShades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] list = new String[N];
        int counter = 0;
        for (int i = 0; i < N; i++){
            String input = sc.next();
            int length = input.length();
            input = input.toLowerCase();
            for (int j = 0; j < length; j++){
                if ((input.charAt(j) == 'r') && ((j+3) < length)){
                    if (input.charAt(j+1) == 'o'){
                        if (input.charAt(j+2) == 's'){
                            if (input.charAt(j+3) == 'e'){
                                counter++;
                                break;
                            }
                        }
                    }
                } 

                if ((input.charAt(j) == 'p') && ((j+3) < length)){
                    if (input.charAt(j+1) == 'i'){
                        if (input.charAt(j+2) == 'n'){
                            if (input.charAt(j+3) == 'k'){
                                counter++;
                                break;
                            }
                        }
                    }
                } 
            }
        }
        if (counter > 0){
            System.out.println(counter);
        }
        else{
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
}
