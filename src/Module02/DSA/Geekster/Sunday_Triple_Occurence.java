package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sunday_Triple_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(hasTripleOccurence(arr));
    }

    private static boolean hasTripleOccurence(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

}
