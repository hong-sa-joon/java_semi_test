package java_02;

public class quiz4 {/*1번,2번*/
    /*이유는 자동타입변화이 아닌 long으로 강제타입변환을 사용해야한다
    * 왜냐하면 long의 허용범위가 더 크기 때문에
    long add(int a, int b) { return a+b;}
    long add(int x, int y) { return x+y;}
 long add(long a, long b) { return a+b;}
 int add(byte a, byte b) { return a+b;}
 int add(long a, int b) { return (int)(a+b);
}
*/
}
