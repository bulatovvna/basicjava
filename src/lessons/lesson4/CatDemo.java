package lessons.lesson4;

public class CatDemo {
    public static void main(String[] args) {

        Cat mycat = new Cat();

        mycat.name = "Masya";
        mycat.age = 1;
        mycat.color = "White";

        String message = "Hi,my name is - " + mycat.name + " and i am " + mycat.age + " years old. " + "My color is " + mycat.color;

        System.out.println(message);

        Cat mycat2 = new Cat("Murzik", "Black");

        message= "It is " + mycat2.name + " and he is " + mycat2.color;
        System.out.println(message);

        Cat mycat3 = new Cat("Masya", 7);

        message = "And it is " + mycat3.name + " she is " + mycat3.age + " years old";
        System.out.println(message);

        Cat mycat4 = new Cat(4, "grey");

        message = "they are " + mycat4.age + " years old" + " and they are " + mycat4.color;
        System.out.println(message);



    }
}
