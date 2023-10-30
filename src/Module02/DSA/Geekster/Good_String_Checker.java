package Module02.DSA.Geekster;

import java.util.Scanner;

public class Good_String_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int freq[] = new int[26];
        for (int i = 0; i < str.length();i++){
             freq[str.charAt(i) - 'a']++;
        }
        int dFreq = 0;
        for (int ele : freq) {
            if (ele != 0 && dFreq == 0){
                dFreq = ele;
            }
            if (ele != 0 && dFreq != ele){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
