package homeworks.homework090223.task4;

public class Lift {
    public static void main(String[] args) {
        int floor = 0;
        int stepUp = 5;
        int stepDown = 2 ;
        while (floor < 12){
            floor = floor + stepUp - stepDown;
            System.out.println(floor);
    }
        System.out.println("На четвертом подьеме поднимется на самый верхний этаж!");
         }
     }
