package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sum_Of_All_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int finalVal = 0;
        for (int i = 0; i < str.length(); i++){
            String ans = "";
            for (int j = i; j < str.length(); j++){
                ans = ans + str.charAt(j);
                finalVal += Integer.valueOf(ans);
            }
        }
        System.out.println(finalVal);
    }
}
