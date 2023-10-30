package Module02.DSA.Geekster;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Furthest_Building_You_Can_Reach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int heights[] = new int[n];
        for (int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
        int bricks = sc.nextInt();
        int ladder = sc.nextInt();
        System.out.println(furthestBuilding(heights, bricks, ladder));
    }

    private static int furthestBuilding(int[] heights, int bricks, int ladder) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int usedBrickes = 0;
        for (int i = 1; i < n; i++){
            int diff = heights[i] - heights[i - 1];
            if (diff > 0){
                pq.add(diff);
                if (pq.size() > ladder){
                    usedBrickes += pq.remove();
                }
                if (usedBrickes > bricks){
                    return i - 1;
                }
            }
        }
        return n-1;
    }
}
