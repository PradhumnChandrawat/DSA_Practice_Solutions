package Module02.DSA.Geekster;

import java.util.Scanner;

public class Crow_Word_2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        char board[][] = new char[n][m];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//                board[i][j] = sc.next().charAt(0);
//            }
//        }
//        String word = sc.next();
//        char fc = word.charAt(0);
//        for(int i = 0; i < n; i ++) {
//            for(int j = 0; j < n; j ++) {
//                if(board[i][j] == fc) {
//                    if(horCheck(board, i, j, word) ||
//                            verCheck(board, i, j, word) ||
//                            majorDiagCheck(board, i, j, word) ||
//                            minorDiagCheck(board, i, j, word)) {
//                        System.out.print(true);
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.print(false);
//        return;
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.next().charAt(0);
            }
        }
        String word = scanner.next();
        boolean result = isWordPresent(matrix, rows, cols, word);
        System.out.println(result ? "true" : "false");
    }

    private static boolean isWordPresent(char[][] matrix, int rows, int cols, String word) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (checkRight(matrix, rows, cols, i, j, word)) {
                    return true;
                }
                if (checkDown(matrix, rows, cols, i, j, word)) {
                    return true;
                }
                if (checkDiagonalDownRight(matrix, rows, cols, i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDown(char[][] matrix, int rows, int cols, int i, int j, String word) {
        if (i + word.length() > rows) {
            return false;
        }
        for (int k = 0; k < word.length(); k++) {
            if (matrix[i + k][j] != word.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonalDownRight(char[][] matrix, int rows, int cols, int i, int j, String word) {
        if (i + word.length() > rows || j + word.length() > cols) {
            return false;
        }
        for (int k = 0; k < word.length(); k++) {
            if (matrix[i + k][j + k] != word.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkRight(char[][] matrix, int rows, int cols, int i, int j, String word) {
        if (j + word.length() > cols) {
            return false;
        }
        for (int k = 0; k < word.length(); k++) {
            if (matrix[i][j + k] != word.charAt(k)) {
                return false;
            }
        }
        return true;

    }

//    private static boolean minorDiagCheck(char[][] board, int i, int j, String word) {
//        int idx = 0;
//        while (i < board.length && j >= 0 && word.charAt(idx) == board[i][j]){
//            i++;
//            j--;
//            idx++;
//            if (idx == word.length()){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static boolean majorDiagCheck(char[][] board, int i, int j, String word) {
//        int idx = 0;
//        while (i < board.length && j < board[j].length && word.charAt(idx) == board[i][j]){
//            i++;
//            j++;
//            idx++;
//            if (idx == word.length()){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static boolean verCheck(char[][] board, int i, int j, String word) {
//        int idx = 0;
//        for (int r = i; r < board.length; r++){
//            if (word.charAt(idx) == board[r][j]){
//                idx++;
//            }
//            if (idx == word.length()){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static boolean horCheck(char[][] board, int i, int j, String word) {
//        int idx = 0;
//        for (int c = j; c < board[j].length; c++){
//            if (word.charAt(idx) == board[i][c]){
//                idx++;
//            }
//            if (idx == word.length()){
//                return true;
//            }
//        }
//        return false;
//    }
}
