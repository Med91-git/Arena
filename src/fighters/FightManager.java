package fighters;

public class FightManager {

    private static int score ;

    public static void fight1v1(Fighter fighterA, Fighter fighterB){

        // Launch the fighting (comparing power points between both fighters)

        if (fighterA.power() > fighterB.power()){

            // Computing the score

            score = fighterA.power() - fighterB.power();

            // Display the results

            Ranking.displayFightResult(fighterA,score);

        }
        else if (fighterA.power() == fighterB.power()) {

            // Computing the score

            score = fighterA.power() - fighterB.power();

            // Display the results

            Ranking.displayFightResult(fighterA,score);

        }
        else {

            // Computing the score

            score = fighterB.power() - fighterA.power();

            // Display the results

            Ranking.displayFightResult(fighterB,score);

        }


    }



}
