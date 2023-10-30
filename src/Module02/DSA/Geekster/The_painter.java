package Module02.DSA.Geekster;

import java.util.Scanner;

public class The_painter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int boards[] = new int[n];
        for (int i = 0; i < n; i++){
            boards[i] = sc.nextInt();
        }
        int painters = sc.nextInt();
        int result = findUnitOfBoard(boards, painters);
        System.out.println(result);
    }

    private static int findUnitOfBoard(int[] boards, int painters) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < boards.length; i++){
            if (start < boards[i]){
                start = boards[i];
            }
            end += boards[i];
        }
        int possible = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (isunitOfBoardPosssible(boards, mid, painters)){
                possible = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return possible;
    }

    private static boolean isunitOfBoardPosssible(int[] boards, int possibleUnit, int painters) {
        int currPainters = 1;
        int currUnit = 0;

        for (int i = 0; i < boards.length; i++){
            currUnit += boards[i];
            if (currUnit > possibleUnit){
                currPainters++;
                currUnit = boards[i];
            }
            if (currPainters > painters){
                return false;
            }
        }
        return true;
    }
}
