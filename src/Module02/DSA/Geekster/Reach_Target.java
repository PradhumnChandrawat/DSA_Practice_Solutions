package Module02.DSA.Geekster;

import java.util.Scanner;

public class Reach_Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int i = 0, j = n - 1;
        while (i < j){
            if (arr[i] + arr[j] == target){
                System.out.println(i + " " + j);
                i ++;
                j --;
            } else if (arr[i] + arr[j] < target) {
                i ++;
            }else
                j --;
        }
    }
}
