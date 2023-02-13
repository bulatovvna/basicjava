package lessons.lesson3.calculator;

import java.util.Scanner;

public class UserInput {
    public int userInputInteger(){
        Scanner scanner = new Scanner(System.in);
        int intInput = scanner.nextInt();
        return intInput;

    }

    public double userInputouble(){
        Scanner scanner = new Scanner(System.in);
        double doubleInput = scanner.nextDouble();
        return doubleInput;
    }
    public String userInputText(){
        Scanner scanner = new Scanner(System.in);
        String textUnput = scanner.nextLine();
        return textUnput;

    }

}
