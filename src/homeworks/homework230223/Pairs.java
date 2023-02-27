package homeworks.homework230223;

public class Pairs {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int sum = 7;

        int firstIndexNumber = 0;
        int lastIndexNumber = array.length - 1;

        while(firstIndexNumber < lastIndexNumber) {

            if(array[firstIndexNumber] + array[lastIndexNumber] > sum){
                lastIndexNumber--;
            } else if (array[firstIndexNumber] + array[lastIndexNumber] < sum){
                firstIndexNumber++;
            } else if (array[firstIndexNumber] + array[lastIndexNumber] == sum){
                System.out.println("Pairs : " + "(" + array[firstIndexNumber] + " , " + array[lastIndexNumber] + ")");
                firstIndexNumber++;
                lastIndexNumber--;
            }


        }
    }
}
