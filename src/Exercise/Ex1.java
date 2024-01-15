package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 12, 32};
        System.out.println("Mảng hiện tại: " + Arrays.toString(array));
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị cần xóa");
        int X = input.nextInt();
//        Đặt vị trí cần xóa mặc định là -1
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int j = index_del; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            int[] newArray = Arrays.copyOf(array, array.length - 1);
            System.out.println("Mảng mới: " + Arrays.toString(newArray));
        } else {
            System.out.println("Vị trí cần xóa không hợp lệ");

        }
    }
}
