package Module02.DSA.Geekster;

import java.util.Scanner;

public class Rotate_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int numValue = 0;
        int c = n;
        while (c > 0){
            c = c/10;
            System.out.println(c+" ccccc / 10 ");
            numValue++;
            System.out.println(numValue+" numValue ");
        }
        if (k < 0){
            k = numValue + k;
        }
        int value = 1;
        System.out.println(numValue - k+" numvalue - k ");
        for (int i = 0; i< numValue - k; i++){
            System.out.println(i+" iii ");
            value *= 10;
            System.out.println(value+" value ");
        }
        int a = n % value;
        System.out.println(a+" n % value");
        int b = n / value;
        System.out.println(b+" n / value ");
        int multiple = 1;
        for (int i = 0; i< k; i++){
            System.out.println(k+" kkkk ");
            multiple *= 10;
        }
        System.out.println(multiple+" multiple ");
        a = (a * multiple) + b;
        System.out.print(a);
    }
}
