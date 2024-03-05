package java_02.quiz8;

interface Animal {
    abstract void sound();

    class Dog implements Animal {
       public void sound() {
            System.out.println("멍멍");
        }
    }
     class Cat implements Animal {
      public   void sound() {
            System.out.println("야옹");
        }
    }


}
