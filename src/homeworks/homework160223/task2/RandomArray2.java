package homeworks.homework160223.task2;
import java.util.Arrays;

public class RandomArray2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[i] - 1) {
            }
            if (isIncreasing) {
                System.out.println("Yes, array is increasing");
            } else {
                System.out.println("No,it's not");
            }
        }

    }
}






