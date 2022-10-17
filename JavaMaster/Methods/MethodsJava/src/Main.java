public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 8;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Bob", calculateHighScorePosition(highScore));
        displayHighScorePosition("Tob", calculateHighScorePosition(highScore * 2));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        displayHighScorePosition("Rob", calculateHighScorePosition(highScore));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }

        return -1;

    }


    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int highScorePosition = 4;

        if (playerScore >= 10000) {
            highScorePosition = 1;
        } else if (playerScore >= 5000) {
            highScorePosition = 2;
        } else if (playerScore >= 1000) {
            highScorePosition = 3;
        }

        return highScorePosition;
    }
}