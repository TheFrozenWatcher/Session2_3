package Exercise;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int[] array= {1,1,2,3,4,5,2,6};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị cần đếm");
        int X= input.nextInt();
        int count=0;
        for (int i=0;i< array.length;i++){
            if (array[i]==X){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của " + X+ " là "+count);
    }
}
