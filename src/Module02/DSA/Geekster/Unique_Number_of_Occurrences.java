package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele : arr){
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int key : hm.keySet()) {
            int freq = hm.get(key);
            if(hs.contains(freq)) {
                System.out.println(false);
                return;
            }
            hs.add(freq);
        }
        System.out.println(true);
    }
}
