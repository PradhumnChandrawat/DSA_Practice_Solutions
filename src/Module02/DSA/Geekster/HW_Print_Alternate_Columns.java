package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Print_Alternate_Columns {
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
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j += 2){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
