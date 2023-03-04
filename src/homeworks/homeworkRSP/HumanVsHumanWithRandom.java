package homeworks.homeworkRSP;

import java.util.Random;
import java.util.Scanner;

public class HumanVsHumanWithRandom {
    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);

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
        int random = rm.nextInt(3);
        String firstPlayerMove = "";

        if (random == 0) {
            firstPlayerMove = "Scissors";
        }
        if (random == 1)
            firstPlayerMove = "Rock";

        if (random == 2)
            firstPlayerMove = "Paper";

        return firstPlayerMove;
    }

    public static String secondPlayer() {
        int random = rm.nextInt(3);
        String secondPlayer = "";

        if (random == 0) {
            secondPlayer = "Scissors";
        }
        if (random == 1)
            secondPlayer = "Rock";

        if (random == 2)
            secondPlayer = "Paper";

        return secondPlayer;
    }

    public static String checkWinner(String firstPlayer, String secondPlayer) {
        System.out.println("First player move: " + firstPlayer + "\n" +
                "Second player move: " + secondPlayer);

        if (firstPlayer.equals("Rock") && secondPlayer.equals("Paper"))
            return "Second player win";

        else if (firstPlayer.equals("Paper") && secondPlayer.equals("Scissors"))
            return "Second player win";

        else if (firstPlayer.equals("Scissors") && secondPlayer.equals("Rock"))
            return "Second player win";

        else if (firstPlayer.equals("Rock") && secondPlayer.equals("Scissors"))
            return "First player win";

        else if (firstPlayer.equals("Paper") && secondPlayer.equals("Rock"))
            return "First player win";

        else if (firstPlayer.equals("Scissors") && secondPlayer.equals("Paper"))
            return "First player win";

        else
            return "Draw";
    }

}
