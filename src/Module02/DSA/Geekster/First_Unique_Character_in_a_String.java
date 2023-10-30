package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.Scanner;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = findUniqChar(s);
        System.out.println(result);
    }

    private static int findUniqChar(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
