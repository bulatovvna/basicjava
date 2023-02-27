package homeworks.homework230223;

public class MissingNumber {
    public static void main(String[] args) {
       int[] array = {3,4,1,7,2,8,5,9,10};
        int n = array.length + 1;
        int missingNumber = (n * (n + 1)/2);

       for (int i = 0; i < array.length; i++) {
           missingNumber = missingNumber - array[i];

       }
       System.out.println("Missing number is : " + missingNumber);
   }

}
