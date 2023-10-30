package Module02.DSA.Geekster;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Happy_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)){
            set.add(n);
            int sum = 0;
            while (n > 0){
                sum += Math.pow((n % 10), 2);
                n /= 10;
            }
            n = sum;
        }
        return n == 1 ? true : false;
    }
}
