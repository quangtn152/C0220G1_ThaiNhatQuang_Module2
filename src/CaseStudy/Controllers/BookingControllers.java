package CaseStudy.Controllers;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Commons.FuncWriteAndReadFileCSV;
import CaseStudy.Commons.ScannerUtils;
import CaseStudy.Models.Customer;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import static CaseStudy.Commons.FuncGeneric.displayList;
import static CaseStudy.Commons.Menu.*;
import static CaseStudy.Controllers.MainController.backMainMenu;

public class BookingControllers {
    private static Queue<Customer> customerQueueBookingTicket = new LinkedList<>();

    public static void addNewBooking() {
        ArrayList<Customer> customerList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.CUSTOMER);
        displayList(customerList);
        System.out.println("---- Choose one Customer to Booking ----");
        Customer customer = new Customer();
        customer = customerList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
        displayMenuBooking();
        processMenuBooking(customer);
        ArrayList<Customer> listBooking = FuncWriteAndReadFileCSV.getBookingFromCSV();
        listBooking.add(customer);
        FuncWriteAndReadFileCSV.writeBookingToFileCSV(listBooking);
        System.out.println("----- Add Booking for: " + customer.getFullName() + " Successfully !!! ----");
        backMainMenu();
    }

    public static void bookingMovieTicket4D() {
        displayMenuBookingMovieTicket4D();
        processMenuBookingMovieTicket4D();
    }

    private static void processMenuBooking(Customer customer) {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1": {
                ArrayList<Villa> villaList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.VILLA);
                displayList(villaList);
                System.out.println("---- Choose Villa Booking ----");
                Villa villa = villaList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setService(villa);
                break;
            }
            case "2": {
                ArrayList<House> houseList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.HOUSE);
                displayList(houseList);
                System.out.println("---- Choose House Booking ----");
                House house = houseList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setService(house);
                break;
            }
            case "3": {
                ArrayList<Room> roomList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.ROOM);
                displayList(roomList);
                System.out.println("---- Choose Room Booking ----");
                Room room = roomList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setService(room);
                break;
            }
            default: {
                backMainMenu();
                break;
            }
        }
    }

    private static void processMenuBookingMovieTicket4D() {
        ScannerUtils.scanner.nextLine();
        switch (ScannerUtils.scanner.nextLine()) {
            case "1": {
                addBookingMovieTicket4D();
                break;
            }
            case "2": {
                showBookingMovieTicked4D();
                break;
            }
            case "3": {
                System.exit(0);
            }
            default: {
                System.out.println("Error!!! Back to Menu");
                backMainMenu();
            }
        }
    }

    private static void showBookingMovieTicked4D() {
        int i = 1;
        System.out.println("------- List ----------");
        for (Customer customer : customerQueueBookingTicket) {
            System.out.println("No: " + i);
            customer.showInfo();
            i++;
            System.out.println("--------------------");
        }
        backMainMenu();
    }

    private static void addBookingMovieTicket4D() {
        try {
            ArrayList<Customer> customerList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.CUSTOMER);
            displayList(customerList);
            System.out.println("----- Choose Customer want booking : -----");
            Customer customer = customerList.get((Integer.parseInt(ScannerUtils.scanner.nextLine())) - 1);
            customerQueueBookingTicket.add(customer);
            System.out.println("---- Add Booking For : " + customer.getFullName() + " Successfully !!!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Customer to booking movie ticked 4d not exists !!! Try again");
            addBookingMovieTicket4D();
        }
        backMainMenu();
    }
}

