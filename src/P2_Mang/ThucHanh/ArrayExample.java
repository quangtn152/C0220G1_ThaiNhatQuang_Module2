package P2_Mang.ThucHanh;

import java.util.Random;

public class ArrayExample {
    public Integer[] createdRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach Mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
