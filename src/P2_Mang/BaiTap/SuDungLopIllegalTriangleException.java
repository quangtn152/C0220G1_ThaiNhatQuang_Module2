package P2_Mang.BaiTap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    static void Triangle(int a, int b, int c) throws IllegalTriangleException {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new IllegalTriangleException("Canh tam giac phai lon hon 0 ");
        }
        if (((a + b) < c) || ((b + c) < a) || ((a + c) < b)) {
            throw new IllegalTriangleException("Day Khong Phai la tam Gia  ");
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("nhap a: ");
            a = scanner.nextInt();
            System.out.println("nhap b: ");
            b = scanner.nextInt();
            System.out.println("nhap c: ");
            c = scanner.nextInt();
            Triangle(a, b, c);
            System.out.println("Its a triangle!");
        } catch (IllegalTriangleException e) {
            System.out.println("ERROR:" + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("ERROR: Nhap sai");
        }
    }
}
