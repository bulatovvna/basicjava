package lessons.test;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        int[] array = {2,5,6,7,4,3,1,9};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
