package fighters;

public class Ranking {

    public static void displayFightResult(Fighter winner, int score){

        if (score <= 1) {
            System.out.println(winner.getName() + " l'emporte avec " + score + " pt d'écart");
        }
        else {
            System.out.println(winner.getName() + " l'emporte avec " + score + " pts d'écart");
        }
    }
}
