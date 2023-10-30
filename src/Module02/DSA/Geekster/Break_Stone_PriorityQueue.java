package Module02.DSA.Geekster;

import javax.swing.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Break_Stone_PriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(lastStoneWeight(arr));
    }

    private static int lastStoneWeight(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int max1;
        int max2;
        for (int ele : arr){
            pq.add(ele);
        }
        while (pq.size() > 1){
             max1 = pq.poll();
             max2 = pq.poll();
             if (max1 > max2){
                 pq.offer(max1 - max2);
             }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
