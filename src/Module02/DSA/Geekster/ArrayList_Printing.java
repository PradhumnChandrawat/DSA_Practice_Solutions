package Module02.DSA.Geekster;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        for (int i = n - 1; i >= 0; i--){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for (int i = n - 1; i >= 0; i--){
            System.out.print(arr.get(i)+" ");
        }

    }
}
