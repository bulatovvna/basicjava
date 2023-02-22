package homeworks.homework160223.task4;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        ArrayUtil au = new ArrayUtil();


        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        //-----максимум----

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Max number is : " +  max);

        // ------минимум------

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min number is : " + min);

        //-----среднее арифметическое-----

        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean += array[i] / array.length;
        }
        System.out.println("The mean number is : " + mean);


        System.out.println("This is the first prime number : " + au.findPrime(array,true));
        System.out.println("This is the last prime number : " + au.findPrime(array,false));
        System.out.println("There are the all prime numbers : " + au.countPrime(array));
    }

}
