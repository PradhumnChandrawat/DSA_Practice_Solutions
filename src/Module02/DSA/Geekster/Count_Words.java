package Module02.DSA.Geekster;

import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int count = 0;
        for (String s : arr){
            if (s.length() > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
