package java_01.Quiz1;

import java.util.ArrayList;

public class quiz6 {
    public static void main(String[] args) {
        int result =0;
        int[] scores = {83, 90, 87};
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i]; j++) {
                result += i;
            }
        }
        System.out.println("배열의 총합: "+(double)result);
        System.out.println("배열의 평균: "+(double)result/3);


    }
}
