package P1_NgonNguLaptrinhJava.thuchanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so: ");
        int numb = scanner.nextInt();
        if (numb < 2) {
            System.out.println(numb + " Khong phai la so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(numb)) {
                if (numb % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(numb + " la so nguyen to");
            } else {
                System.out.println(numb + " k phai la so nguyen to");
            }
        }
    }
}
