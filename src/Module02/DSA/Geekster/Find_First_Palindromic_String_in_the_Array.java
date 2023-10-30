package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_First_Palindromic_String_in_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        System.out.println(findFirstPalindrome(arr));

    }

    private static String findFirstPalindrome(String[] arr) {
        for (String word : arr) {
            if (isPalindrome(word)) {
                System.out.println(word+" word ");
                return word;
            }
        }
        return "empty";
    }

    private static boolean isPalindrome(String word) {
        System.out.println("isPalindrom call ");
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
