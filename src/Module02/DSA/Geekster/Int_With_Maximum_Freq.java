package Module02.DSA.Geekster;

import java.util.Scanner;

public class Int_With_Maximum_Freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[10];
        for (int ele : arr) {
            freq[ele]++;
        }
        int max = 0;
        for (int i = 0; i < 10; i++){
            if (freq[i] > freq[max]){
                max = i;
            }
        }
        System.out.println(max);
    }
}
