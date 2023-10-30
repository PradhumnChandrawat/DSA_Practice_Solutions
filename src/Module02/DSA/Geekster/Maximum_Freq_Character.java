package Module02.DSA.Geekster;

import java.util.Scanner;

public class Maximum_Freq_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] charCount = new int[26];

        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                charCount[c - 'a']++;
            }
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (int i = 1; i < 26; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                mostFrequentChar = (char) ('a' + i);
            }
        }

        System.out.println(mostFrequentChar);

    }
}
