package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ma trận");
        System.out.println("Nhập cạnh");
        int X = input.nextInt();
        if (X < 1) {
            System.out.println("Độ dài ma trận không hợp lệ.");
        } else {
//                Tạo ma trận mới
            int[][] array = new int[X][];
            int[] arr = new int[X];
            for (int i = 0; i < X; i++) {
                array[i] = Arrays.copyOf(arr, X);
            }
//                Nhập giá trị
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < X; j++) {
                    System.out.println("Nhập giá trị có vị trí " + j + " tại mảng có vị trí " + i);
                    array[i][j] = input.nextInt();
                }
            }
//            Tính tổng theo cột
            for (int i = 0; i < X; i++) {
                int sum = 0;
                for (int j = 0; j < X; j++) {
                    sum += array[j][i];
                }
                System.out.println("Tổng của cột " + i + " là " + sum);
            }
//                Tính tổng theo hàng
            for (int i = 0; i < X; i++) {
                int sum = 0;
                for (int j = 0; j < X; j++) {
                    sum += array[i][j];
                }
                System.out.println("Tổng của hàng " + i + " là " + sum);
            }
        }
    }
}
