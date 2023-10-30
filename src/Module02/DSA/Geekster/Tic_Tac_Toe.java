package Module02.DSA.Geekster;

import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                if (i == 0 && j == 0){
                    if (checkHorizontal(arr, i, j, n) ||
                    checkVertical(arr, i, j, n) ||
                    checkRightDigonal(arr, i, j)){
                        System.out.println("Game Ends");
                        return;
                    }
                }
                if (i == 0 && j == 1){
                    if (checkVertical(arr, i, j, n)){
                        System.out.println("Game Ends");
                        return;
                    }
                }
                if (i == 0 && j == n - 1){
                    if (checkVertical(arr, i, j, n) || checkLeftDigonal(arr, i, j)){
                        System.out.println("Game Ends");
                        return;
                    }
                }
                if(i != 0 && j == 0){
                   if (checkHorizontal(arr, i, j, n)){
                       System.out.println("Game Ends");
                       return;
                   }
                }
            }
        }
        System.out.println("Draw");
    }

    private static boolean checkLeftDigonal(int[][] arr, int i, int j) {
        int num = arr[i][j];
        while (i < arr.length && j >= 0){
            if (num == arr[i][j]){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }

    private static boolean checkRightDigonal(int[][] arr, int i, int j) {
        int num = arr[i][j];
        while (i < arr.length && j < arr.length){
            if (num == arr[i][j]){
                i++;
                j++;
            }
            else
                return false;
        }
        return true;
    }

    private static boolean checkVertical(int[][] arr, int i, int j, int n) {
        int num = arr[i][j];
        int count = 0;
        for (int r = i; r < arr.length; r++){
            if (num == arr[r][j]){
                count++;
            }
            if (count == n){
                return true;
            }
        }
        return false;
    }

    private static boolean checkHorizontal(int[][] arr, int i, int j, int n) {
        int num = arr[i][j];
        int count = 0;
        for (int c = j; c < arr.length; c++){
            if (num == arr[j][c]){
                count++;
            }
            if (count == n){
                return true;
            }
        }
        return false;
    }
}
