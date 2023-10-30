package Module02.DSA.Geekster;

import java.util.Scanner;

public class Print_the_matrix_left_diagonal_wise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //1st half
        for (int cn = 0; cn < n; cn++){
            int r = 0 , c = cn;
            while (c >= 0){
                System.out.print(matrix[r][c]+" ");
                r ++;
                c --;
            }
        }
        //2nd half
        for (int rn = 1; rn < n; rn++){
            int r = rn , c = n - 1;
            while (r < n){
                System.out.print(matrix[r][c]+" ");
                r ++;
                c --;
            }
        }
    }
}
