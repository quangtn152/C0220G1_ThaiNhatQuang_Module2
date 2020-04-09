package Mang.ThucHanh;

public class TimGiaTriNhoNhat {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 2, 1, 3, 6};
        int index = minValue(arr);
        System.out.println("Gia tri nho nhat cua mang: " + arr[index]);
    }
}
