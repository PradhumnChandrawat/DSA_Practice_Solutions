package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Index_Retrieval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int start = 0, end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == key){
                System.out.println(mid);
                return;
            }
            if (arr[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            if (start == end && arr[mid] != key){
                System.out.println(start + 1);
                return;
            }
        }
    }
}
