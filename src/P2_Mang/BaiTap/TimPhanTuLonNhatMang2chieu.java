package P2_Mang.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2chieu {
    public static void main(String[] args) {
//        int[][] mang2chieu = {
//                {1, 2, 3},
//                {4, 9, 6},
//                {6, 7, 8}
//        };
        int soDong, soCot;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so Dong:");
        soDong = scanner.nextInt();
        System.out.println("nhap so Cot:");
        soCot = scanner.nextInt();
        int[][] mang2chieu = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("nhap phan tu thu [" + i + "][" + j + "]");
                mang2chieu[i][j] = scanner.nextInt();
            }
        }
        int max = mang2chieu[0][0];
        System.out.println(mang2chieu.length);
        System.out.println(mang2chieu[0][0]);
        for (int i = 0; i < mang2chieu.length - 1; i++) {
            for (int j = 0; j < mang2chieu.length - 1; j++) {
                if (max < mang2chieu[i][j]) {
                    max = mang2chieu[i][j];

                }
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);

    }
}
