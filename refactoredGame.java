import java.util.Random;
import java.util.Scanner;

public class refactoredGame {
    public static void main(String[] args) {
       
        
        refactoredGame gameObj = new refactoredGame();
gameObj.inputData();
gameObj.checkResult();

        
    }

    private Object playerMove;
    private Object computerMove;

    public void inputData(){
        Scanner scanner = new Scanner(System.in);

        String[] computerChoices = {"r", "p", "s"};
        String computerMove = computerChoices[new Random().nextInt(computerChoices.length)];
        
        String playerMove;
        System.out.println("Please enter your move (r, p, or s)");

        while(true){
    
      
    playerMove = scanner.nextLine();
      if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
        break;
      }
      System.out.println(playerMove + " is not a valid move.");
    }
    
    System.out.println("Computer played: " + computerMove);
    }

    public void checkResult(){

        Scanner scanner = new Scanner(System.in);
        playerMove=scanner.next();
        computerMove=scanner.next();

        int playerPoints=0;
    int computerPoints=0;

    

        if (playerMove.equals(computerMove)) {
            System.out.println("The game was a tie!");
          }
          
          else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
              System.out.println("Computer win!" );
              computerPoints++;
            } else if (computerMove.equals("s")) {
              System.out.println("PLayer win!" );
              playerPoints++;
            }
          }
         
          else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
              System.out.println("PLayer win!"  );
              playerPoints++;
            } else if (computerMove.equals("s")) {
              System.out.println("Computer win!" );
              computerPoints++;
            }
          }
          
          else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
              System.out.println("PLayer win!" );
              playerPoints++;
            } else if (computerMove.equals("r")) {
              System.out.println("Computer win!");
              playerPoints++;
            }
          }
          System.out.println("Player has " + playerPoints + " points");
          System.out.println("Computer has " + computerPoints + " points");
    }

    
}