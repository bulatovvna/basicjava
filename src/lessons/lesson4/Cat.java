package lessons.lesson4;

public class Cat {
    String name;
    int age;

    String color;

    public Cat() {

    }

        public Cat(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Cat(int age, String color){
            this.age = age;
            this.color = color;

        }
        public Cat(String name, String color ){
            this.name = name;
            this.color = color;
        }


    }

