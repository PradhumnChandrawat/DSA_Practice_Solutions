package Module02.DSA.Geekster;

import java.util.Scanner;

public class Longest_Palindromic_Substring_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findLongestPalindromicSubString(s));
    }

    private static String findLongestPalindromicSubString(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++){
            int evenLen = expandFromCentre(s, i, i+1);//even case
            int oddLen = expandFromCentre(s, i, i);
            int maxLen = Math.max(evenLen, oddLen);
            if (end - start < maxLen){
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandFromCentre(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i --;
            j ++;
        }
        return j - i - 1;
    }
}
