package Module02.DSA.Geekster;

import java.util.Scanner;

public class CrossWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                board[i][j] = scn.next().charAt(0);
            }
        }
        String word = scn.next();
        char fc = word.charAt(0);
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                if(board[i][j] == fc) {
                    if(horCheck(board, i, j, word) ||
                            verCheck(board, i, j, word) ||
                            majorDiagCheck(board, i, j, word) ||
                            minorDiagCheck(board, i, j, word)) {
                        System.out.print(true);
                        return;
                    }
                }
            }
        }
        System.out.print(false);
        return;
    }
    public static boolean horCheck(char[][] board, int i, int j, String word) {
        int idx = 0;
        while(j < board.length && word.charAt(idx) == board[i][j]) {
            j ++;
            idx ++;
            if(idx == word.length()) return true;
        }
        return false;
    }

    public static boolean verCheck(char[][] board, int i, int j, String word) {
        int idx = 0;
        while(i < board.length && word.charAt(idx) == board[i][j]) {
            i ++;
            idx ++;
            if(idx == word.length()) return true;
        }
        return false;
    }

    public static boolean majorDiagCheck(char[][] board, int i, int j, String word) {
        int idx = 0;
        while(i < board.length && j < board.length && word.charAt(idx) == board[i][j]) {
            i ++;
            j ++;
            idx ++;
            if(idx == word.length()) return true;
        }
        return false;
    }

    public static boolean minorDiagCheck(char[][] board, int i, int j, String word) {
        int idx = 0;
        while(i < board.length && j >= 0 && word.charAt(idx) == board[i][j]) {
            i ++;
            j --;
            idx ++;
            if(idx == word.length()) return true;
        }
        return false;
    }
}
