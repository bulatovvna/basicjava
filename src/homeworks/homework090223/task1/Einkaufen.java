package homeworks.homework090223.task1;

public class Einkaufen {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = true;
        if(isEdekaOpen == true && isReweOpen == false){
            System.out.println("Я могу купить еду,это " + canBuy);
        }
    }
}
