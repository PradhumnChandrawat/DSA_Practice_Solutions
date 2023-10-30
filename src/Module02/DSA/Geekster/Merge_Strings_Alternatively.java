package Module02.DSA.Geekster;

import java.util.Scanner;

public class Merge_Strings_Alternatively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String mergedString = mergeAlternatively(s1, s2);
        System.out.println(mergedString);
    }
    private static String mergeAlternatively(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if (i < s1.length()) {
                result.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                result.append(s2.charAt(i));
            }
        }
        return result.toString();
    }
}
