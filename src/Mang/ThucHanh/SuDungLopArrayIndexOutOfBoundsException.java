package Mang.ThucHanh;


import java.util.Scanner;

public class SuDungLopArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createdRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n nhap vi tri 1 phan tu bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri cua phan tu thu: " + x + " la: " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("gia tri cua phan tu thu " + x + " nam ngoai mang ");
        }

    }
}
