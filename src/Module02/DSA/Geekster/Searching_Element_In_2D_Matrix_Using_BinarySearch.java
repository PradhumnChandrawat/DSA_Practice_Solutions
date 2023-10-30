package Module02.DSA.Geekster;

import java.util.Scanner;

public class Searching_Element_In_2D_Matrix_Using_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        if (searchMatrix(matrix, target)){
            System.out.println("true");
        }
        else System.out.println("false");
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int start = 0;
        int end = (m * n) - 1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if (matrix[mid/m][mid%m] == target){
                return true;
            }
            if (matrix[mid/m][mid%m] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
