package Module02.DSA.Geekster;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : num){
            pq.add(ele);
        }
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        while (!pq.isEmpty()){
            num1.append(pq.remove()+"");
            if (!pq.isEmpty()){
                num2.append(pq.remove()+ "");
            }
        }
        long fn = Long.parseLong(num1.toString());
        long sn = (num2.length() > 0) ? Long.parseLong(num2.toString()) : 0;
        System.out.println(fn + sn);

    }
}
