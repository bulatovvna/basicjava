package homeworks.homework090223.task3;
import java.util.Random;

public class Timer {
    public static void main(String[] args) {
        int max = 28800;
        int min = 0;
        int randomSec = (int) (Math.random() * (max - min + 1) + min);


        int hours = randomSec / 3600;
        int minuts = randomSec % 3600 / 60;
        System.out.println("Осталось - " + randomSec + " секунд!");
        System.out.println("Осталось - часа  " +  hours + " и " + minuts + " минут!");

    }
}
