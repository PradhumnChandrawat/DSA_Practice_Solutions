package Module02.DSA.Geekster;

import java.util.ArrayList;
import java.util.Scanner;

public class Implement_a_stack_using_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while (n --> 0){
            String op = sc.next();
            switch (op){
                case "push":
                    int x = sc.nextInt();
                    arr.add(x);
                    break;
                case "pop":
                    if (!arr.isEmpty()){
                        arr.remove(arr.size() - 1);
                    }
                    break;
                case "display":
                    for (int ele : arr){
                        System.out.print(ele+" ");
                    }
                    System.out.println();
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
            }
        }
    }
}
