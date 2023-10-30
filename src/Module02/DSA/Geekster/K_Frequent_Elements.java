package Module02.DSA.Geekster;

import java.beans.Introspector;
import java.util.*;

public class K_Frequent_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int[] result = findKMostFrequentElements(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findKMostFrequentElements(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] ans = new int[k];

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b) - map.get(a);
            }
        });

        for(int i : map.keySet()){
            queue.add(i);
        }
        for(int i=0; i<k; i++){
            ans[i]=queue.poll();
        }
        return ans;
    }

}
