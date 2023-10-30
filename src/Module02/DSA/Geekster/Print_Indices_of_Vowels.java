package Module02.DSA.Geekster;

import java.util.Scanner;

public class Print_Indices_of_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c ==  'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c ==  'I' || c == 'O' || c == 'U'){
                System.out.print(i+" ");
            }
        }
    }
}
