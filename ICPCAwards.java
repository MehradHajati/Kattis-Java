// Kattis, ICPCAwards
// https://open.kattis.com/problems/icpcawards

import java.util.*;

public class ICPCAwards{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> listOfunis = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        while (N>0){
            String UniName = sc.next();
            String TeamName = sc.next();
            String Name = UniName + " " + TeamName;
            if (!(listOfunis.contains(UniName))){
                listOfunis.add(UniName);
                list.add(Name);
            }
            N--;
        }

        for (int i = 0; i<12; i++){
            System.out.println(list.get(i));
        }
        
    }
}