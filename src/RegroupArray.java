public class RegroupArray {
    public static void main(String[] args) {
        int[] array_1 = {1, 2, 3, 4, 5};
        int[] array_2 = {6, 7, 8, 9, 10};
        int[] array_3 = new int[10];
        for (int j = 0; j < 5; j++) {
            array_3[j] = array_1[j];
        }
        for (int i = 0; i < 5; i++) {
            array_3[i + 5] = array_2[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf(array_3[i]+"\t");
        }
    }
}
