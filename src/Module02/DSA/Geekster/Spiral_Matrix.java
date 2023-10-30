package Module02.DSA.Geekster;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printSpiral(arr, m, n);
    }

    private static void printSpiral(int[][] arr, int tr, int tc) {
        int tempArr = tr * tc;
        int tb = 0, bb = tr - 1, lb = 0, rb = tc - 1;
        while (tempArr > 0){
            for (int i = lb; i <= rb; i++){
                if (tempArr == 0)return;
                System.out.print(arr[tb][i]+" ");
                tempArr --;
            }
            tb ++;

            for (int i = tb; i <= bb; i++){
                if (tempArr == 0)return;
                System.out.print(arr[i][rb]+" ");
                tempArr --;
            }
            rb --;

            for (int i = rb; i >= lb; i--){
                if (tempArr == 0)return;
                System.out.print(arr[bb][i]+" ");
                tempArr --;
            }
            bb --;

            for (int i = bb; i >= tb; i--){
                if (tempArr == 0)return;
                System.out.print(arr[i][lb]+" ");
                tempArr --;
            }
            lb ++;
        }
    }
}
