package lessons.test;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word");
        String word = scanner.nextLine();
        int count = word.length();
        System.out.println("In this word we have " + count + " letters");
    }
}
