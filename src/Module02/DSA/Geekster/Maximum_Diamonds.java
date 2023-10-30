package Module02.DSA.Geekster;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Maximum_Diamonds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxDiamonds(arr, n, k));
    }

    private static long maxDiamonds(int[] arr, int n, int k) {
        PriorityQueue<Integer>  pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr){
            pq.add(ele);
        }
        long ans = 0;
        for (int i = 0; i < k; i++){
            int maxEle = pq.remove();
            ans += maxEle;
            pq.add(maxEle/2);
        }
        return ans;
    }
}
