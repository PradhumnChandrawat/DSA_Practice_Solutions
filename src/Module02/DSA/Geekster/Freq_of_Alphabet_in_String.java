package Module02.DSA.Geekster;


import java.util.Scanner;

public class Freq_of_Alphabet_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int [] freqMap = new int[26];
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int idx = c - 'a';
            freqMap[idx]++;
        }
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int idx = c - 'a';
            int freq = freqMap[idx];
            if (freq > 0){
                System.out.println(c + "-" + freq);
                freqMap[idx] = 0;
            }
        }
    }
}
