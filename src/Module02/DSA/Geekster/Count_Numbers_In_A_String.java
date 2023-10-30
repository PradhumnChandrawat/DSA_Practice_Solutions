package Module02.DSA.Geekster;

import java.util.Scanner;

public class Count_Numbers_In_A_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        boolean isNum = false;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                isNum = true;
            }
            if(isNum == true && isChar(s.charAt(i))){
                count ++;
                isNum = false;
            }
        }
        if(isNum == true){
            count ++;
        }
        System.out.println(count);
    }
    private static boolean isChar(char a) {
        return ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'));
    }
}
