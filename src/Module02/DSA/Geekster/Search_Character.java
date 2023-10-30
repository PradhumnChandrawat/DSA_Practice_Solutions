package Module02.DSA.Geekster;

import java.util.Scanner;

public class  Search_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        findCharacter(arr, ch);
    }
        public static void findCharacter ( char[] arr, char ch){
            int left = 0;
            int right = arr.length - 1;
            char result = 'A';

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] <= ch) {
                    left = mid + 1;
                } else {
                    result = arr[mid];
                    right = mid - 1;
                }
            }
            if (result == 'A') {
                System.out.println("-1");
            } else {
                System.out.println(result);
            }
        }
    }