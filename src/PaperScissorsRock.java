import java.util.Scanner;

public class PaperScissorsRock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String player1;
        String player2;

        while (true){
            System.out.println("Player1: ");
            player1 = input.nextLine();
            System.out.println("Player2: ");
            player2 = input.nextLine();

            if(player1.equals("sc") & player2.equals("sc")){
                System.out.println("Draw");
                break;
            }
            else if(player1.equals("sc")& player2.equals("pp")){
                System.out.println("Winner is Player1");
                break;
            }
            else if(player1.equals("sc")& player2.equals("rc")){
                System.out.println("Winner is Player2");
                break;
            }
            else if(player1.equals("pp") & player2.equals("sc")){
                System.out.println("Winner is Player2");
                break;
            }
            else if(player1.equals("pp") & player2.equals("rc")){
                System.out.println("Winner is Player1");
                break;
            }
            else if(player1.equals("pp") & player2.equals("pp")){
                System.out.println("Draw");
                break;
            }
            else if(player1.equals("rc") & player2.equals("rc")){
                System.out.println("Draw");
                break;
            }
            else if(player1.equals("rc") & player2.equals("pp")){
                System.out.println("Winner is Player2");
                break;
            }
            else if(player1.equals("rc") & player2.equals("sc")){
                System.out.println("Winner is Player1");
                break;
            }

        }
    }
}
