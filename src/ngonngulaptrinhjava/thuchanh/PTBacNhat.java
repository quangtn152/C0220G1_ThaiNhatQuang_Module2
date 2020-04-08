package ngonngulaptrinhjava.thuchanh;

import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
//        ax+b=0
//        x=-b/a
        float a, b, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("gia tri a: ");
        a = scanner.nextFloat();
        System.out.println("gia tri b: ");
        b = scanner.nextFloat();

        if (a != 0) {
            x = -b / a;
            System.out.println("Gia tri Nghiem x: " + x);
        } else if (b != 0) {
            System.out.println("Phuong trinh Vo Nghiem");
        } else {
            System.out.println("Phuong trinh Vo So Nghiem");
        }
    }
}
