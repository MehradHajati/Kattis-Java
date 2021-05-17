// Kattis, AnotherBrick
// https://open.kattis.com/problems/anotherbrick

import java.util.*;

public class AnotherBrick{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int numBricks = sc.nextInt();
        int[] bricks = new int[numBricks];
        for (int i = 0; i < numBricks; i++){
            bricks[i] = sc.nextInt();
        }
        int currentHeight = 0;
        int currentBrick = 0;
        
        while (currentHeight <= height){
            int currentWidth = 0;
            while (currentWidth < width){
                currentWidth += bricks[currentBrick];
                if (currentWidth > width){
                    System.out.println("NO");
                    System.exit(0);
                }
                currentBrick++;
            }
            if (currentHeight < height){
                currentHeight++;
            }
            if (currentHeight == height){
                System.out.println("YES");
                System.exit(0);
            }
        }
    }
}
