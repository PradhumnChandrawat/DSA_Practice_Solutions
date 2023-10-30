package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Odd_Occurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int oddOccurringElement = findOddOccurringElement(arr);
        if (oddOccurringElement != -1) {
            System.out.println(oddOccurringElement);
        } else {
            System.out.println("There is no odd occurring element");
        }
    }

    private static int findOddOccurringElement(int[] arr) {
        int[] frequency = new int[10];
        for (int num : arr) {
            frequency[num]++;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}
