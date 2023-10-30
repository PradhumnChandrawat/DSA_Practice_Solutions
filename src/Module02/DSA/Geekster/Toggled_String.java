package Module02.DSA.Geekster;

import java.util.Scanner;

public class Toggled_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean isToggle = isToggleString(str1, str2);

        System.out.println(isToggle);
    }

    private static boolean isToggleString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if ((Character.isLowerCase(ch1) && Character.isUpperCase(ch2)) ||
                    (Character.isUpperCase(ch1) && Character.isLowerCase(ch2))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

