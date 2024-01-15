package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ma trận");
        System.out.println("Nhập độ dài ma trận");
        int X = input.nextInt();
        if (X < 1) {
            System.out.println("Độ dài ma trận không hợp lệ.");
        } else {
            System.out.println("Nhập độ dài 1 mảng trong ma trận");
            int Y = input.nextInt();
            if (Y < 1) {
                System.out.println("Độ dài mảng không hợp lệ.");
            } else {
//                Tạo ma trận mới
                int[][] array = new int[X][];
                int[] arr = new int[Y];
                for (int i = 0; i < X; i++) {
                    array[i] = Arrays.copyOf(arr, Y);
                }
//                Nhập giá trị
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < Y; j++) {
                        System.out.println("Nhập giá trị có vị trí " + j + " tại mảng có vị trí " + i);
                        array[i][j] = input.nextInt();
                    }
                }
//                Tính tổng từng cột
                for (int i=0;i<Y;i++){
                    int sum=0;
                    for (int j=0;j<X;j++){
                        sum+=array[j][i];
                    }
                    System.out.println("Tổng của cột "+i+" là " +sum);
                }

            }
        }
    }
}
