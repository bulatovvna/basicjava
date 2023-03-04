package homeworks.homeworkRSP;

public class ChoiseGame {
    public static void main(String[] args) {

        ComputerVsComputer cc = new ComputerVsComputer();
        HumanVsHuman hh = new HumanVsHuman();
        HumanVsHumanWithRandom hhr = new HumanVsHumanWithRandom();
        ComputerVsHuman ch = new ComputerVsHuman();

        System.out.println("Choose type of game");
    }
}
