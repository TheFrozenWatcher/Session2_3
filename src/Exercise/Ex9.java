package Exercise;

import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 4};
        int index = 0;
//        Sắp xếp mảng theo thứ tự nhỏ đến lớn
        do {
            boolean check=false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int X = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = X;
                    check=true;
                }
            }

            if (!check){
                break;
            }
        } while (true);
        System.out.println("Mảng đã sắp xếp "+Arrays.toString(arr));
        System.out.println("Giá trị lớn thứ 2: "+ arr[arr.length-2]);

    }
}
