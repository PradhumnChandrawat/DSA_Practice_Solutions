package Module02.DSA.Geekster;

import java.util.Scanner;

public class Sunday_Test_Kavin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String match = sc.nextLine();
            String result = determineWinner(match);
            System.out.println(result);
    }

    private static String determineWinner(String match) {
        int chefScore = 0;
        int opponentScore = 0;

        for (char c : match.toCharArray()) {
            if (c == '1') {
                chefScore++;
            } else {
                opponentScore++;
            }

            if (chefScore >= 11 && chefScore - opponentScore >= 2) {
                return "WIN";
            } else if (opponentScore >= 11 && opponentScore - chefScore >= 2) {
                return "LOSE";
            }
        }
        return "LOSE";
    }
}
