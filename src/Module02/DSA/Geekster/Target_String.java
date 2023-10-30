package Module02.DSA.Geekster;

import java.util.Scanner;

public class Target_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();
        int n = str.length();

        for (int i = 0; i < n - 1; i++){
            String s1 = str.substring(0, n-1);
            String s2 = str.substring(n-1);
//            System.out.println("s1 : "+s1);
//            System.out.println("s2 : "+s2);

            str = s2 + s1;
//            System.out.println("str : "+str);
            if (str.equals(target)){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}
