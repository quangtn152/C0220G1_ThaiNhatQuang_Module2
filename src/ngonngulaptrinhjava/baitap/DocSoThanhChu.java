package ngonngulaptrinhjava.baitap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Nhap so can doc: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Doc so: ");
        if (num < 10) {
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (num < 20) {
            int a = num % 10;
            String duoi = "teen";
            switch (a) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("thir" + duoi);
                    break;
                case 4:
                    System.out.println("four" + duoi);
                    break;
                case 5:
                    System.out.println("fift" + duoi);
                    break;
                case 6:
                    System.out.println("six" + duoi);
                    break;
                case 7:
                    System.out.println("seven" + duoi);
                    break;
                case 8:
                    System.out.println("eigh" + duoi);
                    break;
                case 9:
                    System.out.println("nine" + duoi);
            }
        } else if (num < 100) {
            int a1 = num / 10;
            int a2 = num % 10;
            System.out.println(a1);
            System.out.println(a2);
            switch (a1) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (a2) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        } else if (num < 1000) {
            int b1 = num / 100;
            int b2 = (num / 10);
            int b3 = num % 10;
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);

            switch (b1) {
                case 1:
                    System.out.print("One hundred");
                    break;
                case 2:
                    System.out.print("Two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
            switch (b2 % 10) {
                case 0:
                    break;
                case 2:
                    System.out.print(" and twenty");
                    break;
                case 3:
                    System.out.print(" and thirty");
                    break;
                case 4:
                    System.out.print(" and forty");
                    break;
                case 5:
                    System.out.print(" and fifty");
                    break;
                case 6:
                    System.out.print(" and sixty");
                    break;
                case 7:
                    System.out.print(" and seventy");
                    break;
                case 8:
                    System.out.print(" and eightty");
                    break;
                case 9:
                    System.out.print(" and ninety");
                    break;
            }
            switch (b3) {
                case 0:
//                    System.out.print("");
                    break;
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        }
    }
}
