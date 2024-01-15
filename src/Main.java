import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <Date> void main(String[] args) { // Hàm dùng để chạy chương trình
//        Khai báo mảng tường minh
        int[] arrayName = {1, 2, 3, 4, 5, 6};
//        Bản chất của string là 1 char[]
//        Khai báo theo độ dài
        int[] array = new int[10]; //Tất cả phần tử trong mảng sẽ mang giá trị mặc định
        System.out.println(Arrays.toString(array));
//        Truy cập và thay đổi giá trị phần tử theo index
        array[3] = 100;
        System.out.println("Phần tử index 3 = " + array[3]);

        int[] newArray = addNumber(11, array);
        System.out.println(Arrays.toString(newArray));
        int[] arrayName2 = removeIndex(3, arrayName);
        System.out.println(Arrays.toString(arrayName2));
        String[] arrayString = new String[]{"123", "abc", "xyz"};
        String name = "hung"; //String pool
        String name2 = "hung"; //String pool => name == name2
        String[] newArrayString = arrayString.clone(); // sao chép mảng vào heap
//        So sánh 2 đối tượng trong java
        System.out.println("check " + arrayString.equals(newArrayString)); // false
//        Mảng 2 chiều
            int[][] array2 = {{1,2},{2,3},{3,4}};
//            Truy xuất phần tử đầu tiên của mảng bên ngoài
//            array[i][j] : i là vị trí phần tử mảng bên ngoài, j là vị trí phần tử bên trong mảng đó
//        Duyệt mảng
//        C1:
        for (int i=0;i<arrayString.length;i++){
            System.out.println(arrayString[i]);
        }
//        C2:
        for (String element: arrayString){
            System.out.println((element));
        }
//        C3:
        Arrays.stream(arrayString).forEach((element)->{
            System.out.println(element.length());
        });
//        Tính tổng
        System.out.println(Arrays.stream(arrayName).sum());
//    Duyệt mảng 2 chiều

        for (int i=0;i<array2.length; ){
            int[]arr= array2[i];
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[j]);
            }
        }
//Lưu ý: mảng không thể thay đổi số lượng phần tử
//        Mảng không hỗ trợ các phương thức làm việc với mảng
//        Khi khởi tạo mảng ban đầu mà chưa gán giá trị thì mặc định các phần tử trong mảng mang giá trị mặc định

//        Phương thức (method)
//        Là tập hợp 1 nhóm các câu lệnh xử lý 1 chức năng nhất định
//        public static (kiểu dữ liệu trả về) methodName (tham số)

//        Gọi hàm

    }
//    Sắp xếp


    ;

    //        Tạo hàm để kiểm tra số nguyên tố, tham số, kiểu trả về
    public static boolean checkPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number >= 2;

    }


//    Tạo các hàm, phương thức để thêm mới 1 giá trị vào mảng số nguyên và trả về mảng mới 
//    (2 tham số, mảng và giá trị cần thêm) và xóa 1 phàn tử tại vị trí chỉ định trong mảng và 
//    trả về mảng sau khi đã xử lý

    public static int[] addNumber(int value, int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static int[] removeIndex(int index, int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length - 1);
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);

        return newArray;
    }
}

