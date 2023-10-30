package Module02.DSA.Geekster;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> al = printBinary(n);
        for (String ele : al){
            System.out.print(ele+" ");
        }
    }

    private static ArrayList<String> printBinary(int n) {
        ArrayList<String> arr = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        while (n --> 0){
            String temp = queue.remove();
            arr.add(temp);
            queue.add(temp+"0");
            queue.add(temp+"1");
        }
        return arr;
    }
}
