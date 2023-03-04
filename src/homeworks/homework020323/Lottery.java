package homeworks.homework020323;
/*
создать класс для лотереи (подумать над названием)

добавить переменные для выигрышных номеров (5 номеров) (подумать над названием метода)

ограничить игровые номера от 1 до 50

создать метод который рандомально сетит в переменные выигрышные номера

создать метод, который принимает 5 номеров в аргументах и проверяет их на выигрыш, и печатает все выигранные номера

в отдельном классе Test, в методе main протестировать работу лотереи. (можно использовать Сканнер для ввода или
 хардкодом передать номера в метод лотереи)
 */


import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("This is the winning numbers: " + Arrays.toString(LotteryUtil.winningNumbers()));
        System.out.println("This is the random numbers: " + Arrays.toString(LotteryUtil.randomNumbers()));
         LotteryUtil.checkWinner();

    }

}
