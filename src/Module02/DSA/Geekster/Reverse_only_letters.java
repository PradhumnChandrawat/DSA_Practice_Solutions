package Module02.DSA.Geekster;

import java.util.Scanner;

public class Reverse_only_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       char array[] =  reverseString(s);
       for (char ch : array){
           System.out.print(ch);
       }
    }

    private static char [] reverseString(String s) {
        char arr[] = s.toCharArray();
        int st = 0, e = arr.length - 1;
        while (st < e){
            if (checkCharacter(arr[st]) && checkCharacter(arr[e])) {
                char temp = arr[st];
                arr[st] = arr[e];
                arr[e] = temp;
                st++;
                e --;
            }
            if (!checkCharacter(arr[st])){
                st ++;
            }
            if (!checkCharacter(arr[e])){
                e--;
            }
        }
        return arr;
    }

    private static boolean checkCharacter(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
}
