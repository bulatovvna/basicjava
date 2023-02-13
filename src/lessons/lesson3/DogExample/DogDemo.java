package lessons.lesson3.DogExample;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Zeus";
        dog1.age = 2;

        System.out.println(dog1.name);

        dog1.voice();

        dog1.say("My name is1 " + dog1.name);

        String message = "My name is2 " + dog1.name;
        System.out.println(message);

      dog1.say(message);

        Dog dog2 = new Dog();
        dog2.name = "Markus";
        dog2.age = 5;
        dog2.voice();

        dog2.say("Hi " + dog2.name);


    }


    public static class Dog {
        String name;
        int age;

        public void voice(){
            System.out.println("Gav!!!");
            System.out.println("I am " + age);

        }
        public void say(String massage){
            System.out.println(massage);
        }


        }
}
