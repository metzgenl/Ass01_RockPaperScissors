//Import Scanner
import java.util.Scanner;

public class RPS {

    String continuePlaying = "";
    String playerA = "";
    String playerB = "";
    public void playRPS(){
        Scanner in = new Scanner(System.in);

        //Start entire do-while loop
        do {
            //Get Player A and Player B's choices

            do {
                System.out.print("Player A, pick R, P, or S:");
                playerA = in.nextLine();
            } while (!(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")));

            do {
                System.out.print("Player B, pick R, P, or S:");
                playerB = in.nextLine();
            } while (!(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")));

            //Tie Condition
            if (playerA.equalsIgnoreCase(playerB)){
                //Rock
                if (playerA.equalsIgnoreCase("R")){
                    System.out.println("Rock vs. Rock. It's a tie!");
                }
                //Paper
                else if (playerA.equalsIgnoreCase("P")){
                    System.out.println("Paper vs. Paper. It's a tie!");
                }
                //Scissors
                else{
                    System.out.println("Scissors vs. Scissors. It's a tie!");
                }
            }

            //Player A selected Rock
            else if (playerA.equalsIgnoreCase("R")){
                if (playerB.equalsIgnoreCase("P")){
                    System.out.println("Paper covers Rock. Player B wins!");
                }
                else{
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            }
            //Player A selected Paper
            else if (playerA.equalsIgnoreCase("P")){
                if (playerB.equalsIgnoreCase("R")){
                    System.out.println("Paper covers Rock. Player A wins!");
                }
                else{
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            }
            //Player A selected Scissors
            else {
                if (playerB.equalsIgnoreCase("R")){
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
                else{
                    System.out.println("Scissors cuts Paper. Player A wins!");
                }
            }

            //Check if they would like to play again (Y)
            System.out.print("Do you want to play again? (Y):");
            continuePlaying = in.nextLine();
            //Leave if any input other than Y or y
        }while(continuePlaying.equalsIgnoreCase("Y"));
    }
}
