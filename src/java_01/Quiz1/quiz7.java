package java_01.Quiz1;

public class quiz7 {
    public static void main(String[] args) {
        int[] arrays = {90, 87, 50, 65, 20};
        int min=arrays[0];
        for (int i = 0; i < arrays.length; i++) {
                if (arrays[i]<min){
                    min=arrays[i];
                }
            }
                System.out.println(min);
        }
    }

