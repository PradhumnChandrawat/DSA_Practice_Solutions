package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i ++){
            hm.put(arr[i], i);
        }
        for(int i = 0; i < n; i ++) {
            if(hm.containsKey(sum - arr[i]) && hm.get(sum - arr[i]) != i) {
                System.out.println(i + " " + hm.get(sum - arr[i]));
                return;
            }
        }
    }
}
