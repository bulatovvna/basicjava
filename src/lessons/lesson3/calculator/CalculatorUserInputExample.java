package lessons.lesson3.calculator;
public class CalculatorUserInputExample {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        CalculatorOperatoins calculatorOperatoins = new CalculatorOperatoins();

        System.out.println("Please enter your first number ");
        int n1 = userInput.userInputInteger();
        System.out.println("Please enter your second number ");
        int n2 = userInput.userInputInteger();
        int sumOfNumbers = calculatorOperatoins.sum(n1,n2);
        System.out.println("Sum of numbers are " + sumOfNumbers);

        System.out.println("Please enter your first number ");
        double d1 = userInput.userInputouble();
        System.out.println("Please enter your second number ");
        double d2 = userInput.userInputouble();
        double divisionOfNumbers = calculatorOperatoins.Division(d1,d2);
        System.out.println("Division of Numbers are " + divisionOfNumbers);




    }



}
