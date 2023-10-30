package Module02.DSA.Geekster;

import java.util.Scanner;

public class Palindromic_String_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        convertString(str);
    }

    private static void convertString(String str) {
        String afterConvert = str.replaceAll("[ ,:]+", "").toLowerCase();
        if (isPalindrome(afterConvert)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    private static boolean isPalindrome(String afterConvert) {
        int s = 0;
        int e = afterConvert.length() - 1;
        while (s < e){
            if (afterConvert.charAt(s) != afterConvert.charAt(e)){
                return false;
            }
            s ++;
            e --;
        }
        return true;
    }
}
