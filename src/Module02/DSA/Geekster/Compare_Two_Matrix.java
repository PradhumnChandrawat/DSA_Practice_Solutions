package Module02.DSA.Geekster;

import java.util.Scanner;

public class Compare_Two_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int arr1[][] = new int[n1][m1];
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < m1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int arr2[][] = new int[n2][m2];
        for (int i = 0; i < n2; i++){
            for (int j = 0; j < m2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        if (n1 != n2 || m1 != m2){
            System.out.println("Not Same");
            return;
        }
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < m1; j++){
                if (arr1[i][j] != arr2[i][j]){
                    System.out.println("Not Same");
                    return;
                }
            }
        }
        System.out.println("Same");
    }
}
