package Module02.DSA.Geekster;

import java.util.Scanner;

public class Basic_Calculator_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char ch = sc.next().charAt(0);

        int result;

        switch (ch) {
            case 'A':
                result = x + y;
                System.out.println(result);
                break;
            case 'S':
                result = x - y;
                System.out.println(result);
                break;
            case 'M':
                result = x * y;
                System.out.println(result);
                break;
            case 'D':
                if (y == 0) {
                    System.out.println("Undefined");
                } else {
                    result = x / y;
                    System.out.println(result);
                }
                break;
            case 'R':
                if (y == 0) {
                    System.out.println("Undefined");
                } else {
                    result = x % y;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Enter again");
                break;
        }
    }
}
