package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int digitMap[] = new int[10];
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                int num = c - '0';
                digitMap[num]++;
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++){
            if (digitMap[i] > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
