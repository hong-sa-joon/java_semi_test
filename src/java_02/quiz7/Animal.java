package java_02.quiz7;

abstract public class Animal {
    abstract void sound();

    static class Dog extends Animal {
        void sound() {
            System.out.println("멍멍");
        }
    }
    static class Cat extends Animal {
        void sound() {
            System.out.println("야옹");
        }
    }


}
