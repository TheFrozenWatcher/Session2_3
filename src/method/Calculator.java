package method;

import java.util.ArrayList;
import java.util.Scanner;



public class Calculator {
    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static int minusInt(int a, int b) {
        return a - b;
    }

//    public static void String[] printArray(String[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println((i + 1) + ". " + array[i]);
//            return;
//        } ;
//    }

    ;

//    Ứng dụng quản lý công việc
    /*
    Menu
    1. In danh sách công việc
    2. Thêm mới việc cần làm
    3. Sửa nội dung ở vị trí cần sửa
    4. Xóa công việc đã hoàn thành ở vị trí cần xóa
    5. Thoát chương trình
         */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        int choice;

        do {
            System.out.println("Menu\n" +
                    "    1. In danh sách công việc\n" +
                    "    2. Thêm mới việc cần làm\n" +
                    "    3. Sửa nội dung ở vị trí cần sửa\n" +
                    "    4. Xóa công việc đã hoàn thành ở vị trí cần xóa\n" +
                    "    5. Thoát chương trình");
            choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Chương trình kết thúc");
                break;
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("In danh sách công việc");
                        break;
                    case 2:
                        System.out.println("Thêm mới việc cần làm");
                        String newJob = scanner.next();
                        break;
                    case 3:
                        System.out.print("Sửa nội dung ở vị trí cần sửa");
                        float indexToEdit= scanner.nextFloat();
                        break;
                    case 4:
                        System.out.println("Xóa công việc đã hoàn thành ở vị trí cần xóa");
                        float indexToDelete= scanner.nextFloat();
                        break;
                    default:
                        System.out.println("Không hợp lệ");
                        break;
                }
            }
        } while (choice != 5);
    }
}
