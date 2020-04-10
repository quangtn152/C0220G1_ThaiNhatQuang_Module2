package Mang.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 4, 2};
        int x, index;
        int[] newArr = new int[arr.length + 1];
        System.out.println("Nhap So can chen vao mang: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        index = scanner.nextInt();//2
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        for (int value : newArr) {
            System.out.print(value + " ");
        }
        System.out.println(" ");
        for (int i = newArr.length-1; i >0; i--) {
            newArr[i] = newArr[i-1];
            if (index == i) {
                newArr[i] = x;
            }
        }
        for (int value : newArr) {
            System.out.print(value + " ");
        }
    }
}
