package Module02.DSA.Geekster;

import java.util.Scanner;

public class Desired_String_Optmise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        int fa = -1 , la = -1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                if (fa == -1){
                    fa = i;
                }
                la = i;
                count ++;
            }
        }
        if (count < 2){
            System.out.println(-1);
            return;
        }
        System.out.println((count*(count - 1)/2));
        System.out.println(la - fa + 1);
        System.out.println(s.substring(fa, la + 1));
    }
}
