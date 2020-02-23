class j0002 {

    public static void main(String[] args) {

        boolean game_over = true;
        int score = 800;
        int bonus = 100;
        int level_completed = 5;
        if (game_over) {
            int final_score = score + (level_completed * bonus);
            System.out.println("Your final Score is " + final_score);
        }
        if (game_over) {
            score = 10000;
            bonus = 200;
            level_completed = 8;
            int second_score = score + (level_completed * bonus);
            System.out.println("Your Second Final Score is " + second_score);
        }
    }
}