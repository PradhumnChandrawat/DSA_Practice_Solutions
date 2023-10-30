package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Valid_Anagram_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();

        if (str.length() != str1.length()){
            System.out.println("No");
            return;
        }

        System.out.println(checkAnagram(str , str1));
    }

    private static String checkAnagram(String str, String str1) {
        int freq [] = new int[26];
        for (int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str1.length(); i++){
            freq[str1.charAt(i) - 'a']--;
        }
        for (int ele : freq){
            if (ele > 0){
                return "No";
            }
        }
        return "Yes";
    }
}
