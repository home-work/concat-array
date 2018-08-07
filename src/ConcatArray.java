import java.util.Scanner;

public class ConcatArray {
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

        //Hợp 2 mảng
        int[] array_3 = new int[sizeOfArray_1 + sizeOfArray_2];
        for (int i = 0; i < array_1.length; i++) {
            array_3[i] = array_1[i];
        }
        for (int i = 0; i < array_2.length; i++) {
            array_3[sizeOfArray_1 + i] = array_2[i];
        }
        System.out.println("Mảng sau khi hợp là:");
        for (int i = 0; i < array_3.length; i++) {
            System.out.printf(array_3[i] + "\t");
        }
    }
}
