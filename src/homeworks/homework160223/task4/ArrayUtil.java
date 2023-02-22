package homeworks.homework160223.task4;

public class ArrayUtil {

    public boolean isPrime(int number){
        boolean checkPrime = true;

        for (int i = 2; i < number ; i++) {
            if (number%i == 0){
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }

    public int countPrime(int[] workingArray){
        int counter = 0 ;
        for (int i = 0; i < workingArray.length; i++) {
            if  ((workingArray[i] != 1) && (isPrime(workingArray[i]))) {
                counter++;
            }
        }
        return counter;
    }

    public int findPrime(int[] workingArray, boolean direction){
        int primeElement = -1;
        boolean flag = true;
        int counter;

        if (direction) {
            counter = 0;
        } else {
            counter = workingArray.length-1;
        }

        while (flag){
            if ((workingArray[counter] != 1) && (isPrime(workingArray[counter]))){
                primeElement = workingArray[counter];
                flag = false;
            }

            if (direction) {
                counter++;
            } else {
                counter--;
            }
        }
        return primeElement;
    }
}
