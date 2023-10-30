package Module02.DSA.Geekster;

import java.util.Scanner;

public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        findFirstNonRepeating(str);
        
    }
    private static void findFirstNonRepeating(String str) {
        int[] count = new int[256];
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                flag = true;
                System.out.println(str.charAt(i));
                return;
            }
        }
        if (flag == false){
            System.out.println("-1");
        }
    }
}
