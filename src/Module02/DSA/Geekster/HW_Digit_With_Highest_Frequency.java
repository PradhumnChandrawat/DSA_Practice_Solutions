package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Digit_With_Highest_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digitArr[] = new int[10];
        while (num > 0){
            int digit = num % 10;
            digitArr[digit]++;
            num /= 10;
        }
        int maxFreq = 0;
        int resultDigit = -1;
        for (int i = 0; i < 10; i++){
            if (digitArr[i] > maxFreq){
                maxFreq = digitArr[i];
                resultDigit = i;
            }
        }
        System.out.println(resultDigit);
    }
}
