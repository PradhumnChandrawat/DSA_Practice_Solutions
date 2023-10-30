package Module02.DSA.Geekster;

import java.util.Scanner;

public class Power_Of_A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findSubstring(s));
    }

    private static int findSubstring(String s) {
        int start = 0, end = 0, origLen = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++){
            int evenLen = expandFromCenter(s,i,i+1);
            int oddLen = expandFromCenter(s,i,i);
            int maxLen = Math.max(evenLen, oddLen);
            if (end - start < maxLen){
                start = i - (maxLen - 1)/2;
                end = i + maxLen/2;
            }
            if (origLen < maxLen){
                origLen = maxLen;
            }
        }
        return origLen;
    }

    private static int expandFromCenter(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i --;
            j ++;
        }
        return j - i - 1;
    }
}
