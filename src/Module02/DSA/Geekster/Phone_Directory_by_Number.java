package Module02.DSA.Geekster;

import java.util.HashMap;
import java.util.Scanner;

public class Phone_Directory_by_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<>();

        int choice = 0;
        while (choice != 4) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String phoneNumber = sc.next();
                    String name = sc.next();
                    hm.put(phoneNumber, name);
                    break;
                case 2:
                    phoneNumber = sc.next();
                    if (hm.containsKey(phoneNumber)) {
                        System.out.println(hm.get(phoneNumber));
                    } else {
                        System.out.println("-1");
                    }
                    break;
                case 3:
                    phoneNumber = sc.next();
                    hm.remove(phoneNumber);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("please check the number !");
            }
        }
    }
}
