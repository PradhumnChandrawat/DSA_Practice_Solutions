package Module02.DSA.Geekster;

import java.util.Scanner;

public class N_Queens_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(isSafe(arr) ? "N Queens" : "Danger");
    }

    private static boolean isSafe(int[][] arr) {
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr.length; c++){
                if (arr[r][c] == 1){
                    if (checker(arr,r,c) == false){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean checker(int[][] arr, int r, int c) {
        for (int i = c + 1; i < arr.length; i++){
            if (arr[r][i] == 1) return false;
        }
        for (int i = r + 1; i < arr.length; i++){
            if (arr[i][c] == 1) return false;
        }
        int tempRow = r + 1, tempCol = c + 1;
        while (tempRow < arr.length && tempCol < arr.length){
            if (arr[tempRow][tempCol] == 1) return false;
            tempRow ++;
            tempCol ++;
        }
        tempRow = r + 1; tempCol = c - 1;
        while (tempRow < arr.length && tempCol >= 0){
            if (arr[tempRow][tempCol] == 1) return false;
        }
        return true;
    }
}
