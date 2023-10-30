package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Character_and_its_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++){
             hm.put(arr[i],hm.getOrDefault(arr[i], 0) + 1 );
        }
        for (char ch : arr){
            if (hm.get(ch) != 0){
                System.out.println(ch+" "+hm.get(ch));
            }
            hm.put(ch, 0);
        }
    }
}
