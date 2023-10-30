package Module02.DSA.Geekster;

import java.util.Scanner;

public class Reverse_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int k = 0; k < sb.length(); k++){
            if (sb.charAt(k) == ch){
                j = k;
                break;
            }
        }
        reverseString(i, j, sb, ch);
    }

    private static void reverseString(int i, int j, StringBuilder sb, char ch) {
       while (i < j){
           char I = sb.charAt(i);
           char J = sb.charAt(j);
           sb.setCharAt(i, J);
           sb.setCharAt(j, I);
           i ++;
           j --;
       }
        System.out.println(sb);
    }
}
