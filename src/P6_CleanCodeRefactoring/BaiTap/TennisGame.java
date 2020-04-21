package P6_CleanCodeRefactoring.BaiTap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        boolean isScoreEqual = player1Score == player2Score;
        if (isScoreEqual) {
            score = getEqual(player1Score);
        } else {
            boolean isAdvanceScore = player1Score >= 4 || player2Score >= 4;
            if (isAdvanceScore) {
                score = getWin(player1Score, player2Score);
            } else {
                score = getStatus(player1Score, player2Score, score);
            }
        }
        return score;
    }

    private static String getEqual(int playerScore1) {
        String score;
        switch (playerScore1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String getStatus(int playerScore1, int playerScore2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = playerScore1;
            else {
                score += "-";
                tempScore = playerScore2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getWin(int playerScore1, int playerScore2) {
        String score;
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }
}
