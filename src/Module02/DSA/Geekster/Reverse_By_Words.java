package Module02.DSA.Geekster;

import java.util.Scanner;

public class Reverse_By_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String afterReversed = reversedString(str);
        System.out.println(afterReversed);
    }
    private static String reversedString(String str) {
        String words[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reversedChar(word);
            sb.append(reversedWord);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    private static String reversedChar(String s) {
        char arr[] = s.toCharArray();
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        return new String(arr);
    }
}
