package LapTrinhHuongDoiTuong.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        return (this.b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scn.nextDouble();
        System.out.println("Nhap b: ");
        double b = scn.nextDouble();
        System.out.println("Nhap c: ");
        double c = scn.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a, b, c);
        if (ptb2.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co 2 nghiem la x1 = " + ptb2.getRoot1() + " x2 = " + ptb2.getRoot2());
        } else if (ptb2.getDiscriminant() == 0) {
            System.out.println("Phuong Trinh co 1 nghiem x = " + ptb2.getRoot1());
        } else {
            System.out.println("phuong trinh vo nghiem");
        }

    }
}
