package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int X = input.nextInt();
        int[] array = new int[X];
        for (int i = 0; i < X; i++) {
            System.out.println("Nhập giá trị có vị trí " + i);
            array[i] = input.nextInt();
        }
        System.out.println("Mảng: "+ Arrays.toString(array));
        int min= array[0];
        for (int i=0;i<X;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Số nhỏ nhất là "+min);

    }
}
