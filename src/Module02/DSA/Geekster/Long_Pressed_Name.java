package Module02.DSA.Geekster;

import java.util.Scanner;

public class Long_Pressed_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String typed = sc.nextLine();
        boolean ans = findLongPressedString(name, typed);
        System.out.println(ans);
    }
    private static boolean findLongPressedString(String name, String typed) {
        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        return true;
    }
}
