package Module02.DSA.Geekster;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Target_Indices_After_Sorting_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++){
            if (arr[i] == key){
                System.out.print(i+" ");
            }
        }
    }
}
