package homeworks.homework020323;

import java.util.Arrays;

public class LotteryUtil {
    public static int[] winningNumbers() {
        int[] winningFiveNumbers = {21, 5, 12, 1, 48};

        return winningFiveNumbers;
    }

    public static int[] randomNumbers() {
        int[] rand = new int[5];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = (int) (Math.random() * 50) + 1;
        }
        return rand;
    }

    public static void checkWinner() {
        for (int i = 0; i < winningNumbers().length; i++) {
            for (int j = 0; j < randomNumbers().length; j++) {

                if (winningNumbers()[0] == randomNumbers()[j]) {
                    System.out.println("This is the winner: " + winningNumbers()[0]);
                }
                if (winningNumbers()[1] == randomNumbers()[j]) {
                    System.out.println("This is the winner: " + winningNumbers()[1]);
                }
                if (winningNumbers()[2] == randomNumbers()[j]) {
                    System.out.println("This is the winner: " + winningNumbers()[2]);
                }
                if (winningNumbers()[3] == randomNumbers()[j]) {
                    System.out.println("This is the winner: " + winningNumbers()[3]);
                }
                if (winningNumbers()[4] == randomNumbers()[j]) {
                    System.out.println("This is the winner: " + winningNumbers()[4]);
                }
                }

            }

        }
    }

