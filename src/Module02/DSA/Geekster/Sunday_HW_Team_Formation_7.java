package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Sunday_HW_Team_Formation_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++)    arr[i] = scn.nextInt();

        Arrays.sort(arr);
        int sum = arr[0] + arr[N-1];
        int ans = 0;
        int l = 0, r = N-1;
        while(l < r){
            if(arr[l] + arr[r] == sum){
                ans += arr[l] * arr[r];
                l++; r--;
            }
            else{
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);

    }
}
