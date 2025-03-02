import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        boolean win = false;

        do {
            System.out.println("Player A enter a move: ");
            playerA = in.nextLine();

            System.out.println("Player B enter a move: ");
            playerB = in.nextLine();


            if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Player A wins!");
                win = true;
            }

            if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Player A wins!");
                win = true;
            }

            if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Player B wins!");
                win = true;
            }

            if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Player A wins!");
                win = true;
            }

            if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Player B wins!");
                win = true;
            }

            if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Tie!");
                win = false;
            }

            if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Tie!");
                win = false;
            }

            if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Tie!");
                win = false;
            }


        }while(win == false);

    }
}