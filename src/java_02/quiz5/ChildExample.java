package java_02.quiz5;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

      /*6번 문제*/  ((Child) parent).field2 = "data2"; //(불가능)
        ((Child) parent).method3(); //(불가능)


  /* Parent의 method2를 child가 상속받고 재정의했으므로
   Parent-method1()
Child-method2()
라 뜬다*/

    }
}
