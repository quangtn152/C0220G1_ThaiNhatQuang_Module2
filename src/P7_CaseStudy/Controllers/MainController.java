package P7_CaseStudy.Controllers;

import java.util.Scanner;

import static P7_CaseStudy.Controllers.BookingControllers.addNewBooking;
import static P7_CaseStudy.Controllers.BookingControllers.bookingMovieTicket4D;
import static P7_CaseStudy.Controllers.CustomerController.addNewCustomer;
import static P7_CaseStudy.Controllers.CustomerController.showInformationCustomer;
import static P7_CaseStudy.Controllers.EmployeeController.findEmployee;
import static P7_CaseStudy.Controllers.EmployeeController.showInformationEmployee;
import static P7_CaseStudy.Controllers.ServiceController.addNewServices;
import static P7_CaseStudy.Controllers.ServiceController.showServices;

public class MainController {


    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("1.Add New Services"
                + "\n2.Show Services"
                + "\n3.Add New Customer"
                + "\n4.Show Information of Customer"
                + "\n5.Add New Booking"
                + "\n6.Show Information of Employee"
                + "\n7.Booking Movie Ticket 4D"
                + "\n8.Find Employee"
                + "\n9.Exit"
        );
        System.out.println("Nhap lua chon:");
        String choose = scn.nextLine();
        switch (choose) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationEmployee();
                break;
            case "7":
                bookingMovieTicket4D();
                break;
            case "8":
                findEmployee();
                break;
            case "9":
//                exitMenu();
                System.exit(0);
                break;
            default:
                System.out.println("Failed: please choose again!!!! Enter to continue...");
                scn.nextLine();
                displayMainMenu();

        }
    }



}
