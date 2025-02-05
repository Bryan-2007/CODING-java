public class Main {
    public static void main(String[] args) {
        System.out.println("OUTPUT\n===================================");
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Percy", calculateHighScorePosition(500));
        displayHighScorePosition("Gilbes", calculateHighScorePosition(100));
        displayHighScorePosition("James", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list");
        }

    public static int calculateHighScorePosition(int score) {
        return score >= 1000 ? 1 : (score >= 500 ? 2 : (score >= 100 ? 3 : 4));
    }
}