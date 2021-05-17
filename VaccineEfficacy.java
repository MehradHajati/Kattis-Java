// Kattis, VaccineEfficacy
// https://open.kattis.com/problems/vaccineefficacy

import java.util.*;

public class VaccineEfficacy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double controlGroup = 0;
        double vaccinatedGroup = 0;
        double numVaccAndA = 0;
        double numVaccAndB = 0;
        double numVaccAndC = 0;
        double numPlaceboAndA = 0;
        double numPlaceboAndB = 0;
        double numPlaceboAndC = 0;
        for (int i = 0; i < N; i++){
            String person = sc.next();
            if (person.charAt(0) == 'Y'){
                vaccinatedGroup++;
                if (person.charAt(1) == 'Y'){
                    numVaccAndA++;
                }
                if (person.charAt(2) == 'Y'){
                    numVaccAndB++;
                }
                if (person.charAt(3) == 'Y'){
                    numVaccAndC++;
                }
            }
            else{
                controlGroup = controlGroup +1;
                if (person.charAt(1) == 'Y'){
                    numPlaceboAndA++;
                }
                if (person.charAt(2) == 'Y'){
                    numPlaceboAndB++;
                }
                if (person.charAt(3) == 'Y'){
                    numPlaceboAndC++;
                }
            }
        }


        double vaccineEfficacyA = 100 * (1 - ((numVaccAndA / vaccinatedGroup) / (numPlaceboAndA / controlGroup)));
        double vaccineEfficacyB = 100 * (1 - ((numVaccAndB / vaccinatedGroup) / (numPlaceboAndB / controlGroup)));
        double vaccineEfficacyC = 100 * (1 - ((numVaccAndC / vaccinatedGroup) / (numPlaceboAndC / controlGroup)));

        
        if (vaccineEfficacyA <= 0){
            System.out.println("Not Effective");
        }
        else{
            System.out.println(vaccineEfficacyA);
        }


        if (vaccineEfficacyB <= 0){
            System.out.println("Not Effective");
        }
        else{
            System.out.println(vaccineEfficacyB);
        }

        if (vaccineEfficacyC <= 0){
            System.out.println("Not Effective");
        }
        else{
            System.out.println(vaccineEfficacyC);
        }

    }
}