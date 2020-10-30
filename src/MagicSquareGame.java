import java.util.Scanner;

public class MagicSquareGame {
    /**
     * This main method setups the game play and contains the game loop where each player continues to take turns until
     * a player wins or the game is a DRAW
     * @param args not used
     */
    public static void main(String[] args) {
        do {
            printDirections();
            getName();
            getSelection();
            takePlayerTurn();
        } while(isDraw() & isWin == false);
    }
    /**
     * This takePlayerTurn method will prompt for and display the player's choice of numbers and then determine if the game has been won,
     * is a draw, or the game should continue
     *
     * @param p - the Player
     * @param both - player1 and player 2 choices
     * @return a number indicating the game state(CONTINUE, DRAW, WIN)
     */
    public static boolean takePlayerTurn(p, both) {
    p.getChoice();
    p.choose()
    both.getChoice();
    }

    /**
     * This isDraw method will determine if the game is a draw due to all choices made and no one player had a winning combination
     * @param both - player 1 and player 2 choices
     * @return true if all values have been picked, game is a DRAW, false otherwise
     */
    public static boolean isDraw(both) {
        if both.choices = 0b1_1111_1111
    }

    /**
     * This isWin method determines if a player's magic square choices result in a winning combination
     * @param p the player
     * @return true, if the player has won, false otherwise
     */
    public static boolean isWin(p) {
        int[] wins = new int[]{66, 98, 170, 370, 371, 379, 383, 511};
        for (int i : wins) {
            if (p.magicSquare.getChoices == (short) wins[i]) {
                System.out.println("player " + p + " has won the contest!");
            }
        }
    }

    /**
     * This getSelection method asks the player for their number selection from 1 - 9.  If the user does not enter a number in this
     * range, they are continually prompted until they do enter a number between 1 and 9.  If the user has already entered
     * a number that has been chosen, they are continually prompted until they enter a number that has not been previously selected.
     * @param p - Player
     * @return the number chosen from 1-9
     *
     */
    public static void getSelection(p){
        Scanner number = new Scanner(System.in);
        System.out.println("player "+getName(p)+ " please choose a number from 1-9");
        int num = number.nextInt();
        return num;
    }

    /**
     * This getName method receives a player's number and prompts that player for their name.
     * @param playerNum the player's number
     * @return the player's name
     */
    public static void getName(playerNum) {
        Scanner playerNum = new Scanner(System.in);
        System.out.println("Enter a name for player "+playerNum);
        String name = playerNum.nextLine();
        return name;
    }

    /**
     * This printDirections method prints out the game introduction
     */
    public static void printDirections() {
        System.out.println("Welcome to the game of Magic Squares");
        System.out.println("***********************************");
        System.out.println("Rules:");
        System.out.println("2 players play the game.");
        System.out.println("Each player takes turns picking a number from 1-9.");
        System.out.println("No number can be chosen twice");
        System.out.println("The first player to have 3 numbers that sum to 15 wins!");
        System.out.println("2 7 6");
        System.out.println("9 5 1");
        System.out.println("4 3 8");
        System.out.println("***********************************");

    }

   
}

