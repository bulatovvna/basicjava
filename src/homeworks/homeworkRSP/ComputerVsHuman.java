package homeworks.homeworkRSP;

import java.util.Random;
import java.util.Scanner;

public class ComputerVsHuman {
    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);
    final static String WRONG_INPUT ="Your choise is wrong" ;

    public static void main(String[] args) {
        while (true) {
            System.out.println(checkWinner(human(), computer()));
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
    public static String human() {
        String move = "";

        while (true) {
            System.out.println("Your turn " + move);
            move = sc.nextLine();

            if (isRightMove(move)) {
                break;
            } else {
                System.out.println(WRONG_INPUT);
            }
        }
        return move;
    }
        public static String computer () {
            int random = rm.nextInt(3);
            String computerMove = "";

            if (random == 0) {
                computerMove = "Scissors";
            }
            if (random == 1)
                computerMove = "Rock";

            if (random == 2)
                computerMove = "Paper";

            return computerMove;
        }

        public static String checkWinner (String human, String computer){
            System.out.println("Your move: " + human + "\n" +
                    "Computer move: " + computer);

            if (human.equals("Rock") && computer.equals("Paper"))
                return "Computer win";

            else if (human.equals("Paper") && computer.equals("Scissors"))
                return "Computer win";

            else if (human.equals("Scissors") && computer.equals("Rock"))
                return "Computer win";

            else if (human.equals("Rock") && computer.equals("Scissors"))
                return "You win";

            else if (human.equals("Paper") && computer.equals("Rock"))
                return "You win";

            else if (human.equals("Scissors") && computer.equals("Paper"))
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
