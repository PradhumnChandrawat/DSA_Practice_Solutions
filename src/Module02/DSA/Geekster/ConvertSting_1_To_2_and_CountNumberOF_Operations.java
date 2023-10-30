package Module02.DSA.Geekster;

import java.util.Scanner;

public class ConvertSting_1_To_2_and_CountNumberOF_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();

        int operationCount = minDistance(str, str1);
        System.out.println(operationCount);
    }
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                    System.out.println(dp[i][j]+" ifff ");
                } else if (j == 0) {
                    dp[i][j] = i;
                    System.out.println(dp[i][j]+" else iff  ");
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    System.out.println("(word1.charAt(i - 1) :"+(word1.charAt(i - 1)+"=="+"word2.charAt(j - 1) :"+ word2.charAt(j - 1)));
                    dp[i][j] = dp[i - 1][j - 1];
                    System.out.println("dp[i - 1] : "+dp[i - 1][j - 1]);
                    System.out.println(dp[i][j]+" else iff 02 ");
                } else {
                    System.out.println("dp[i - 1][j - 1] : "+(dp[i - 1][j - 1]+"(dp[i - 1][j]+ dp[i][j - 1] :"+(dp[i - 1][j])+" : "+ dp[i][j - 1]));
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                    System.out.println(dp[i][j]+" else ");
                }
            }
        }

        return dp[m][n];
    }
}
