package Module02.DSA.Geekster;

import java.util.*;

public class Unable_to_Eat_Lunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int students[] = new int[n];
        for (int i = 0; i < n; i++){
            students[i] = sc.nextInt();
        }
        int sandwiches[] = new int[n];
        for (int i = 0; i < n; i++){
            sandwiches[i] = sc.nextInt();
        }
        System.out.println(countStudentsUnableToEat(students, sandwiches, n));
    }

    private static int countStudentsUnableToEat(int[] students, int[] sandwiches, int n) {
       int arr[] = new int[2];
       for(int i = 0; i < n; i++){
           arr[students[i]]++;
       }
       for (int i = 0; i < n; i++){
           if (arr[sandwiches[i]] > 0){
               arr[sandwiches[i]]--;
           }
           else break;
       }
       return arr[0] + arr[1];
    }
}
