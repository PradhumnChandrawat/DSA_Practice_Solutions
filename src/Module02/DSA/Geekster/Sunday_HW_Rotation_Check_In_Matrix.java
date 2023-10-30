package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sunday_HW_Rotation_Check_In_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0 ; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean result = areRowsCircularRotations(arr, n);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean areRowsCircularRotations(int[][] arr, int n) {
        int[] referenceRow = new int[n];
        for (int j = 0; j < n; j++) {
            referenceRow[j] = arr[0][j];
        }

        for (int i = 1; i < n; i++) {
            int[] currentRow = new int[n];
            for (int j = 0; j < n; j++) {
                currentRow[j] = arr[i][j];
            }

            boolean found = false;
            for (int k = 0; k < n; k++) {
                if (isEqualCircularShift(referenceRow, currentRow, k)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    private static boolean isEqualCircularShift(int[] referenceRow, int[] currentRow, int k) {
        int n = referenceRow.length;
        for (int i = 0; i < n; i++) {
            if (referenceRow[i] != currentRow[(i + k) % n]) {
                return false;
            }
        }
        return true;
    }
}
