package Module02.DSA.Geekster;

import java.util.Scanner;

public class Find_Distance_BW_Two_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char fc = sc.next().charAt(0);
        char lc = sc.next().charAt(0);
        int i = -1;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < str.length(); j++){
            if (str.charAt(j) == lc && i != -1){
                min = Math.min(min, j - i - 1);
            }
            else if (str.charAt(j) == fc) {
                i = j;
            }
        }
        System.out.println(min);
    }
}
