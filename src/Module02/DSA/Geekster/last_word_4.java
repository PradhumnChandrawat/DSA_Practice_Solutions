package Module02.DSA.Geekster;

import java.util.Scanner;

public class last_word_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int count = 0;
        int i = arr.length - 1;
        while (i > 0){
            if (checkCharacter(arr[i])){
                count++;
                i --;
            }else {
                System.out.println(count);
                return;
            }
        }
    }

    private static boolean checkCharacter(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
}
