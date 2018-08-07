import java.util.Scanner;

public class RegroupArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập mảng thứ 1
        System.out.println("Nhập vào kích thước của mảng thứ 1:");
        int sizeOfArray_1= scanner.nextInt();
        int[] array_1 = new int[sizeOfArray_1];
        for (int i = 0; i < sizeOfArray_1; i++) {
            System.out.println("\tNhập vào giá trị của phần tử thứ " + (i + 1));
            array_1[i] = scanner.nextInt();
        }

        //Nhập mảng thứ 2
        System.out.println("Nhập vào kích thước của mảng thứ 2:");
        int sizeOfArray_2= scanner.nextInt();
        int[] array_2 = new int[sizeOfArray_2];
        for (int i = 0; i < sizeOfArray_1; i++) {
            System.out.println("\tNhập vào giá trị của phần tử thứ " + (i + 1));
            array_2[i] = scanner.nextInt();
        }



//        int[] array_1 = {1, 2, 3, 4, 5};
//        int[] array_2 = {6, 7, 8, 9, 10};
//        int[] array_3 = new int[10];
//        for (int j = 0; j < 5; j++) {
//            array_3[j] = array_1[j];
//        }
//        for (int i = 0; i < 5; i++) {
//            array_3[i + 5] = array_2[i];
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.printf(array_3[i]+"\t");
//        }
    }
}
