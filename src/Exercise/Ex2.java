package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Mảng hiện tại: " + Arrays.toString(array));
        System.out.println("Nhập vị trị cần chèn");
        int index_add = input.nextInt();
        if (index_add > array.length - 2 || index_add < 0) {
            System.out.println("Vị trí không hợp lệ.");
        } else {
            System.out.println("Nhập giá trị cần thêm:");
            int X = input.nextInt();
            int[] newArray= Arrays.copyOf(array, array.length+1);
            for (int i=index_add;i< newArray.length;i++){
                newArray[i]=newArray[i-1];
            }
            newArray[index_add] = X;
            System.out.println("Mảng hiện tại: " + Arrays.toString(newArray));
        }

    }
}
