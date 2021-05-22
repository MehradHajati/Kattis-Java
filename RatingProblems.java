// Kattis, RatingProblems
// https://open.kattis.com/problems/ratingproblems

import java.util.*;

public class RatingProblems{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totaljudges = sc.nextInt();
        double rated = sc.nextInt();
        double points = 0;
        for (int i = 0; i < rated; i++){
            points += sc.nextInt();
        }
        double max = (points + ((totaljudges - rated) * 3)) / totaljudges;
        double min = (points + ((totaljudges - rated) * -3)) / totaljudges;
        System.out.println(min + " " + max);
    }
}