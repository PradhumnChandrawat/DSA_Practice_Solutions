package Module02.DSA.Geekster;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Greatest_Till_ME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] prefixArray = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            max = Math.max(max, array[i]);
            prefixArray[i] = max;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(prefixArray[i]);
        }
    }
}
