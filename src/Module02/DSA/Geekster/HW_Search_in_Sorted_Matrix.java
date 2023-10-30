package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Search_in_Sorted_Matrix {
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
        int x = sc.nextInt();
         findElement(arr, m ,n , x);
    }

    private static void findElement(int[][] arr, int m, int n, int x) {
        boolean flag = false;
        int r = 0, c = 0;
        for (r = 0; r < m; r++){
            for (c = 0; c < n; c++){
                if (arr[r][c] == x){
                    flag = true;
                    if (flag == true){
                        System.out.println(r);
                        System.out.println(c);
                        break;
                    }
                }
            }
        }if (flag == false){
            System.out.println("Not Found");
        }
    }
}
