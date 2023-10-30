package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word_Meaning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> hm = new HashMap<>();
        while (true){
            int n = sc.nextInt();
            if (n == 4){
                return;
            }
            String word = sc.next();
            switch (n){
                case 1:
                    String meaning = sc.next();
                    hm.put(word, meaning);
                    break;
                case 2:
                    System.out.println(hm.getOrDefault(word, "-1"));
                    break;
                case 3:
                    hm.remove(word);
                    break;
            }
        }
    }
}
