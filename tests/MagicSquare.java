import java.util.Scanner;

public class MagicSquare {

    /**
     *
     */
    private short choices;

    /*
    choice 1 = 0b0000001;
    choice 2 = 0b0000011;
    choices will store what the number the player chose.
    */

    /**
     *
     */
    public void MagicSquare() {

        //constructor that initializes choices to zero

        short empty = 0b000000000;
        choices = empty;

        System.out.println(choices);

        while (hasAlreadyChosen((byte) choices) == false) {
            Scanner game = new Scanner(System.in);
            System.out.println("Pick an integer between 1 and 9");
            int game1 = game.nextInt();
        }

    }
        //set choices to 0b000000
        //prompt peoples names
        //see if they have already been chosen
        //did they actually enter numbers? that are winning condition?
        //if they did return that the player has won, or that there is a draw

        //MagicSquare() - Instantiates a magic square object.

        //



    public boolean choose(byte selection) {
        //Accepts a byte value ranging between 1-9. This will set the
        //set bit to true if its been chosen, or false if it hasn't + change choices to reflect changes
        // choose 2 will change 0000000010 return value true;
        // if choose 2 is already done return false;
        // true false or illegalargumentexception
        // bit at the index selection - 1 to "on." Tis method then returns
        // true if the bit was changed, false if the selection has already been chosen,
        // and throws an IllegalArgumentException if selection is less than 1 or greater than 9.
        if (selection > 9 | selection < 0) {
            throw new IllegalArgumentException("This number is not a valid input");
        }

        short result = createMask(selection);
        short res2 = (short) (result | choices);
        System.out.println((short)result);
        String res = Integer.toBinaryString(result);
        result = Integer.toBinaryString(result & choices);

        if(result != 0){return false;}

        short mask = createMask(selection);

        result = (short) (result & mask);
        choices = (short)(choices | result);

        return true;
    }


    private short createMask(byte selection){

        short mask = 0b0000001;
        return (short)(mask << selection);

    }

    public boolean hasAlreadyChosen(byte selection) {

//        passing in a number true if its been chosen, if its not it returns false;
//        this boolean will work in choose and print choices methods
//        000110001 will return that the player has chosen 3 numbers in those locations

        int index = selection - 1;
        short x = createMask((byte) index);
        short y = createMask(selection);
        //use bitmask to only turn this one to on, then do selection compare
        // try a do while loop

        System.out.println("What is your choice?");

        if ((x & y) != 0) {
                return false;
        }
            return true;

            //Returns true if the bit at index selection - 1 is set to the "on" position,
            //or false if the bit is in the "off" position.
            // THIS WILL USE A BITMASK TO ALTER THE LOCATIONS
            //shifting a mask of 1 over by the amount. mask choices >> 7 if choices != 01000000
            //Note: This method will also require a bit mask to determine the state of the
            //bit at index selection - 1.



    }
    public short getChoices() {
        this.choices = choices;
//            int[] wins = new int[]{66, 98, 170, 370, 371, 379, 383, 511};
//            for (int i : wins) {
//                if (choices == (short) wins[i]) {
//                    return isWon();
//                }
                ;
                //Getter for the choices field. This number can then be examined to determine
                // if the player has won the match or not

//                short mask = 1;
//                //mask = (short)(mask << choices);
//                choices = (short) (array & mask);
//                mask = (short) (mask << choices);

            return choices;
        }
    public void printChoices() {
        //prints the board for the particular player, it doesnt return 0s and 1s
        // use a datastructure to hold the values to print it out, like 1d or 2d array;
        //plus has already chosen method
        System.out.println(choices);
        String s = String.valueOf(choices);
        long count = s.chars()
            .mapToObj(i -> (char)i)
            .filter(ch -> ch.equals('1'))
            .count();
        System.out.println(count);

        int[] intArray = new int[]{ 2,7,6,9,5,1,4,3,8 };
        int[] exArray = new int[]{ 0,0,0,0,0,0,0,0,0 };


//        int[][] board = new int[3][3];

//    for(int i = 0; i < 3; i++) {
//        for(int j = 0; j < 3; j++){
//            board[i][j] = Integer.parseInt();
//        }
//    }

        // this is where the win is located for example A1 + A2 + A3 = 15 ;; 001100010 / 98
        //use AND to show the player selections 101100011 against a victory selection 001100010
        // if result = 98 then victory
    }
}
