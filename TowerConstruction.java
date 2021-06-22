// Kattis, TowerConstruction
// https://open.kattis.com/problems/tornbygge

import java.util.*;

public class TowerConstruction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numBricks = sc.nextInt();
        int towerCounter = 1;
        int lastBrick = sc.nextInt();
        while (numBricks > 1){
            int brick = sc.nextInt();
            if (brick > lastBrick){
                towerCounter++;
            }
            lastBrick = brick;
            numBricks--;
        }
        System.out.println(towerCounter);
    }
}