class j0003 {

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + "scored this much to get into in top " + position);
    }

    public static int calHighScorePosition(int player_score) {
        if (player_score > 1000) {
            return 1;
        } else if (player_score > 500 && player_score < 1000) {
            return 2;
        }
        return player_score;
    }

    public static void main(String[] args) {
        displayHighScorePosition("Ayush", 1);
    }
}