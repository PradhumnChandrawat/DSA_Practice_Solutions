package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.Scanner;

public class Length_of_Longest_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }

    private static int longestPalindrome(String s) {
        //creating Freq map
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c , 1);
            }
        }
        //main logic for find LP
        int max = 0;
        boolean isOdd = false;
        for (Character key : map.keySet()){
            if (map.get(key) % 2 == 0){
                max += map.get(key);
            }
            else {
                if (isOdd == false){
                    max += map.get(key);
                    isOdd = true;
                }
                else {
                    max += map.get(key) - 1;
                }
            }
        }
        return max;
    }
}
