package Module02.DSA.Geekster;

import java.util.Scanner;

public class Count_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int i = 0, count = 0;
        int max = Integer.MIN_VALUE;
        while (i < n){
            if (s.charAt(i) == '1'){
                count++;
            }
           else{
               count = 0;
           }
           if (max < count){
               max = count;
           }
           i++;
        }
        System.out.println(max);
    }
}
