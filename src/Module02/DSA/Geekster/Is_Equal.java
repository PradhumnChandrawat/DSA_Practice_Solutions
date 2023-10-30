package Module02.DSA.Geekster;

import java.util.Scanner;

public class Is_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()){
            System.out.println("false");
            return;
        }
        boolean flag = true;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                flag = false;
            }
        }
        if (flag){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
//        if (s1.equals(s2)){
//            System.out.println("true");
//        }else
//            System.out.println("false");
    }
}
