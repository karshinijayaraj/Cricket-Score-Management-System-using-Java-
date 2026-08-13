import java.util.Scanner;

public class CricketScoreManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String teamName, opponent;

        int runs = 0;
        int wickets = 0;
        int fours = 0;
        int sixes = 0;
        int overs = 0;

        System.out.println("=========================================");
        System.out.println("      CRICKET SCORE MANAGEMENT");
        System.out.println("=========================================");

        System.out.print("Enter Team Name: ");
        teamName = sc.nextLine();

        System.out.print("Enter Opponent Team: ");
        opponent = sc.nextLine();

        while (true) {

            System.out.println("\n=========================================");
            System.out.println(teamName.toUpperCase() + " vs " + opponent.toUpperCase());
            System.out.println("=========================================");
            System.out.println("1. Add Single Run");
            System.out.println("2. Add Four");
            System.out.println("3. Add Six");
            System.out.println("4. Add Wicket");
            System.out.println("5. Complete Over");
            System.out.println("6. Show Live Score");
            System.out.println("7. Match Summary");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    runs += 1;
                    System.out.println("1 Run Added");
                    break;

                case 2:
                    runs += 4;
                    fours++;
                    System.out.println("FOUR!");
                    break;

                case 3:
                    runs += 6;
                    sixes++;
                    System.out.println("SIX!");
                    break;

                case 4:
                    wickets++;
                    System.out.println("Wicket Fallen!");
                    break;

                case 5:
                    overs++;
                    System.out.println("Over Completed!");
                    break;

                case 6:

                    System.out.println("\n=========================================");
                    System.out.println("          LIVE CRICKET SCORE");
                    System.out.println("=========================================");
                    System.out.println("Match : " + teamName + " vs " + opponent);
                    System.out.println("Score : " + runs + "/" + wickets);
                    System.out.println("Overs : " + overs + ".0");

                    if (overs > 0) {
                        double runRate = (double) runs / overs;
                        System.out.printf("Run Rate : %.2f\n", runRate);
                    }

                    System.out.println("4s : " + fours);
                    System.out.println("6s : " + sixes);
                    System.out.println("Status : " + teamName + " Batting");
                    System.out.println("=========================================");
                    break;

                case 7:

                    System.out.println("\n=========================================");
                    System.out.println("           MATCH SUMMARY");
                    System.out.println("=========================================");

                    System.out.println("Team           : " + teamName);
                    System.out.println("Opponent       : " + opponent);

                    System.out.println("\nRuns           : " + runs);
                    System.out.println("Wickets        : " + wickets);
                    System.out.println("Overs          : " + overs + ".0");

                    System.out.println("\nFours          : " + fours);
                    System.out.println("Sixes          : " + sixes);

                    int boundaryRuns = (fours * 4) + (sixes * 6);

                    System.out.println("Boundary Runs  : " + boundaryRuns);

                    if (overs > 0) {
                        double runRate = (double) runs / overs;
                        System.out.printf("Run Rate       : %.2f\n", runRate);
                    }

                    System.out.println("\nMatch Status   : In Progress");

                    System.out.println("=========================================");
                    break;

                case 8:

                    System.out.println("\n=========================================");
                    System.out.println("        MATCH CLOSED SUCCESSFULLY");
                    System.out.println("=========================================");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}