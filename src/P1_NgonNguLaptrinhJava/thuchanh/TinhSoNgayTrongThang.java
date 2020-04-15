package P1_NgonNguLaptrinhJava.thuchanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So Thang: ");
        int month = scanner.nextInt();
        String daysinMonths;
        switch (month) {
            case 2:
//                System.out.println("THang 2 co 28 hoac 29 ");
                daysinMonths = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("Thang " + month+ " co 31 ngay ");
                daysinMonths = "31";

                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.println("thang "+ month + "co 30 ngay");
                daysinMonths = "30";

                break;
            default:
//                System.out.println("Failed");
                daysinMonths = "";
        }
        if (daysinMonths != "") {
            System.out.printf("Thang '%d' co '%s' ngay ", month, daysinMonths); //
        }else {
            System.out.println("failed");
        }
    }
}
