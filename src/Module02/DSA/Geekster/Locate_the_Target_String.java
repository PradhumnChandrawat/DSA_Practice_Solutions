package Module02.DSA.Geekster;

import java.util.Scanner;

public class Locate_the_Target_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();
        char fc = target.charAt(0);
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == fc){
                int ind = i;
                if (locateTarget(i, str, target)){
                    System.out.println(ind);
                    return;
                }
            }
        }
        System.out.println("-1");

//        Optimised Solution

//        int i = 0, j = target.length();
//        while (j <= str.length()){
//            if (str.charAt(i) == target.charAt(0) && str.substring(i, j).equals(target)){
//                System.out.print(i);
//                return;
//            }
//            i ++;
//            j ++;
//        }
//        System.out.print("-1");
    }

    private static boolean locateTarget(int i, String str, String target) {
        int idx = 0;
        while (i < str.length() && target.charAt(idx) == str.charAt(i)){
            i++;
            idx++;
            if(idx == target.length()){
                return true;
            }
        }
        return false;
    }
}
