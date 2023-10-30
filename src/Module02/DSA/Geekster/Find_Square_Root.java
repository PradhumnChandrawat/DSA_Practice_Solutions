package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = 1, high = n, ans = 0;
        while (low <= high){
           int mid = (low + high)/2;
           if ((mid * mid) <= n){
               ans = mid;
               low = mid + 1;
           }
           else {
               high = mid - 1;
           }
        }
        System.out.println(ans);
    }
}
