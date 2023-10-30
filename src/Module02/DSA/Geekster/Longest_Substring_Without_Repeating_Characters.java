package Module02.DSA.Geekster;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));

    }
    private static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int max = 0;
        Set<Character> seen = new HashSet<>();
        while (j < s.length()){
            char c = s.charAt(j);
            if (seen.add(c)){
                max = Math.max(max, j - i + 1);
                j ++;
            }
            else {
                if (seen.contains(c)){
                    seen.remove(s.charAt(i));
                    i ++;
                }
            }
        }
        return max;
    }
}
