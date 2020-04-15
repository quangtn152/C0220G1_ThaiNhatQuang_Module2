package P3_LapTrinhHuongDoiTuong.BaiTap;

import java.util.Random;

public class SelectionSort {
    public Integer[] creatRandom(int n) {
        Random numb = new Random();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numb.nextInt(n);
        }
        return arr;
    }

    public void Sort(Integer[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
            }

        }
    }


}
