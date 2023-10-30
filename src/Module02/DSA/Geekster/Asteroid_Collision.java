package Module02.DSA.Geekster;

import java.util.Scanner;
import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       int array[] =  asteroideCollision(arr);
        for (int ele : array){
            System.out.print(ele+" ");
        }
    }

    private static int[] asteroideCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            if (stack.isEmpty() || arr[i] > 0){
                stack.push(arr[i]);
            }
            else {
                while (!stack.isEmpty()){
                    int top = stack.peek();
                    if (top < 0){
                        stack.push(arr[i]);
                        break;
                    }
                    int absVal = Math.abs(arr[i]);
                    if (absVal == top){
                        stack.peek();
                        break;
                    }
                    else if (absVal < top) {
                        break;
                    }
                    else {
                        stack.pop();
                        if (stack.isEmpty()){
                            stack.push(arr[i]);
                            break;
                        }
                    }
                }
            }
        }
        int len = stack.size();
        int array[] = new int[len];
        for (int i = array.length - 1; i >= 0; i--){
            array[i] = stack.pop();
        }
        return array;
    }
}
