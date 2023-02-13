package lessons.lesson3.calculator;

public class calculatorDemo {
    public static void main(String[] args) {
        CalculatorOperatoins calculatorOperatoins = new CalculatorOperatoins();
        int a = 5;
        int b = 10;
        calculatorOperatoins.sum(a,b);

        int resultOfSum = calculatorOperatoins.sum(a,b);
        System.out.println(resultOfSum);

        int resultOfSum2 = calculatorOperatoins.sum(5,10);
        System.out.println(resultOfSum2);

        int resultOfMinus = calculatorOperatoins.minus(84,56);
        System.out.println(resultOfMinus);

        int resultOfDiv = calculatorOperatoins.div(90,3);
        System.out.println(resultOfDiv);

        int resultOfMultiplicatoin = calculatorOperatoins.Multiplication(2,24);
        System.out.println(resultOfMultiplicatoin);

        double resultOfDivision = calculatorOperatoins.Division(12.5, 2.5);
        System.out.println(resultOfDivision);

    }
}
