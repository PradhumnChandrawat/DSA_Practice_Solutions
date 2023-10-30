package Module02.DSA.Geekster;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Relative_Ranks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n; i++){
            arr[i] = scn.nextInt();
        }
        String[] res = findRelativeRanks(arr);
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }
    }

    private static String[] findRelativeRanks(int[] score) {
        int n=score.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> score[b]-score[a]);
        for(int i=0;i<n;i++){
            pq.add(i);
        }
        String[] ans = new String[n];
        int i=1;
        while(!pq.isEmpty()){
            int idx=pq.poll();
            if(i==1){
                ans[idx]="Gold Medal";
                i++;
            }
            else if(i==2){
                ans[idx]="Silver Medal";
                i++;
            }
            else if(i==3){ ans[idx]="Bronze Medal";
                i++;
            }
            else ans[idx]=Integer.toString(i++);
        }
        return ans;
    }

}
