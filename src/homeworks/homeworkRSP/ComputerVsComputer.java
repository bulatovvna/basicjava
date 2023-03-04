package homeworks.homeworkRSP;

import java.util.*;

public class ComputerVsComputer {
    static Random rm = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(checkWinner(computer1(), computer2()));
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
    public static String computer1() {
        int random = rm.nextInt(3);
        String computer1Move = "";

        if (random == 0) {
            computer1Move = "Scissors";
        }
        if (random == 1)
            computer1Move = "Rock";

        if (random == 2)
            computer1Move = "Paper";

        return computer1Move;
    }

    public static String computer2() {
        int random = rm.nextInt(3);
        String computer2Move = "";

        if (random == 0) {
            computer2Move = "Scissors";
        }
        if (random == 1)
            computer2Move = "Rock";

        if (random == 2)
            computer2Move = "Paper";

        return computer2Move;
    }

    public static String checkWinner(String comp1, String comp2) {
        System.out.println("Computer1 move: " + comp1 + "\n" +
                 "Computer2 move: " + comp2);

        if (comp1.equals("Rock") && comp2.equals("Paper"))
            return "Computer2 win";

        else if (comp1.equals("Paper") && comp2.equals("Scissors"))
            return "Computer2 win";

        else if (comp1.equals("Scissors") && comp2.equals("Rock"))
            return "Computer2 win";

        else if (comp1.equals("Rock") && comp2.equals("Scissors"))
            return "Computer1 win";

        else if (comp1.equals("Paper") && comp2.equals("Rock"))
            return "Computer1 win";

        else if (comp1.equals("Scissors") && comp2.equals("Paper"))
            return "Computer1 win";

        else
            return "Draw";
    }


}
