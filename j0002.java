class j0002 {

    public static void main(String[] args) {

        boolean game_over = true;
        int score = 800;
        int bonus = 100;
        int level_completed = 5;
        mainr(game_over, score, bonus, level_completed);
        score = 10000;
        bonus = 200;
        level_completed = 9;
        if (game_over) {
            int second_score = score + (level_completed * bonus);
            System.out.println("Your Second Final Score is this " + second_score);
        }
    }

    public static void mainr(boolean game_over, int score, int bonus, int level_completed) {
        if (game_over) {
            int final_score = score + (level_completed * bonus);
            System.out.println("Your final Score is " + final_score);
        }

    }
}