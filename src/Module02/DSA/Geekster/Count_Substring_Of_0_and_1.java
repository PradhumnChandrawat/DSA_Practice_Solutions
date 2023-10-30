package Module02.DSA.Geekster;

import java.util.Scanner;

public class Count_Substring_Of_0_and_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int arrOfBatches[] = new int[n];
        int count = 1, idx = 0, i = 1;
        while (i < s.length()){
            if (s.charAt(i) == s.charAt(i - 1)){
                count ++;
            }
            else {
                arrOfBatches[idx] = count;
                count = 1;
                idx ++;
            }
            i ++;
        }
        arrOfBatches[idx] = count;
//        for (int ele : arrOfBatches){
//            System.out.print(ele+" ");
//        }
        System.out.println();
       int sum = 0;
        for (int j = 1; j <= idx; j++){
            sum += Math.min(arrOfBatches[j],arrOfBatches[j - 1]);
        }
        System.out.println(sum);
    }
}
