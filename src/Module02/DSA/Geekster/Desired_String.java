package Module02.DSA.Geekster;

import java.util.Scanner;

public class Desired_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        String longestStr = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'A'){
                for (int j = i + 1; j < str.length(); j++){
                    if (str.charAt(j) == 'A'){
                        int currSize = j + 1 - i;
                        if (currSize > max){
                            max = currSize;
                            longestStr = str.substring(i, j + 1);
                        }
                        count ++;
                    }
                }
            }
        }
        if (count > 0){
            System.out.println(count);
            System.out.println(max);
            System.out.println(longestStr);
        }else
            System.out.println(-1);
    }
}
