package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Same_Number_Same_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int ele : arr){
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }
        Arrays.sort(arr);
        for (int ele : arr){
            if (Math.abs(ele) == hm.get(ele)){
                System.out.println(ele);
                hm.put(ele, 0);
            }
        }
    }
}
