package java_01.Quiz1;

public class quiz3 {
    public static void main(String[] args) {
            int result=0;
        for (int i = 1; i <= 20; i++) {
            if (i%2==0){
                result+=i;
            }
        }
            System.out.println("2의 배수의 합"+"="+result);
    }
}
