package Module02.DSA.Geekster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class K_Weakest_Rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer>[] sorter = new ArrayList[m + 1];
        for (int c = 0; c <= m; c++){
            sorter[c] = new ArrayList<>();
        }
        for (int r = 0; r < n; r++){
            int pow = getPow(arr[r]);
            sorter[pow].add(r);
        }
        for (int i = 0; i <= m; i++){
            for (int ele : sorter[i]){
                System.out.print(ele+" ");
                k --;
                if (k == 0) return;
            }
        }
    }

    private static int getPow(int[] row) {
        int l = 0;
        int h = row.length - 1;
        while (l <= h){
            int mid = l + (h - l)/ 2;
            if (row[mid] == 0){
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return l;
    }
}
