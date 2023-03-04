package homeworks.homeworkRSP;

import java.util.Random;
import java.util.Scanner;

public class HumanVsHuman{
    static Scanner sc = new Scanner(System.in);
    final static String WRONG_INPUT ="Your choise is wrong" ;

    public static void main(String[] args) {
        while (true) {
            System.out.println(checkWinner(firstPlayer(), secondPlayer()));
            if (isEnd()) {
                break;
            }
        }
    }

    public static boolean isEnd() {
        char answer = ' ';

        while (true){
            System.out.println("Do you wanna continue the game?\n" +
                    "y = yes\n" +
                    "n = no");
            answer = sc.nextLine().charAt(0);
            if (answer == 'y' || answer == 'n')
                break;
        }
        if(answer == 'y')
            return false;
        else
            return true;
    }
    public static String firstPlayer() {
        String move = "";

        while (true) {
            System.out.println("First player turn " + move);
            move = sc.nextLine();

            if (isRightMove(move)) {
                break;
            } else {
                System.out.println(WRONG_INPUT);
            }
        }
        return move;
    }
    public static String secondPlayer() {
        String move = "";

        while (true) {
            System.out.println("Second player turn " + move);
            move = sc.nextLine();

            if (isRightMove(move)) {
                break;
            } else {
                System.out.println(WRONG_INPUT);
            }
        }
        return move;
    }

    public static String checkWinner (String firstPlayer, String secondPlayer){
        System.out.println("Your move: " + firstPlayer + "\n" +
                "Computer move: " + secondPlayer);

        if (firstPlayer.equals("Rock") && secondPlayer.equals("Paper"))
            return "Computer win";

        else if (firstPlayer.equals("Paper") && secondPlayer.equals("Scissors"))
            return "Computer win";

        else if (firstPlayer.equals("Scissors") && secondPlayer.equals("Rock"))
            return "Computer win";

        else if (firstPlayer.equals("Rock") && secondPlayer.equals("Scissors"))
            return "You win";

        else if (firstPlayer.equals("Paper") && secondPlayer.equals("Rock"))
            return "You win";

        else if (firstPlayer.equals("Scissors") && secondPlayer.equals("Paper"))
            return "You win";

        else
            return "Draw";
    }
    private static boolean isRightMove (String move){
        if (!move.equals("Scissors") && !move.equals("Rock") && !move.equals("Paper")) {
            return false;
        } else
            return true;
    }



}
