package CaseStudy.Controllers;

import CaseStudy.Commons.ScannerUtils;

import static CaseStudy.Commons.Menu.*;
import static CaseStudy.Controllers.BookingControllers.addNewBooking;
import static CaseStudy.Controllers.BookingControllers.bookingMovieTicket4D;
import static CaseStudy.Controllers.CustomerControllers.addNewCustomer;
import static CaseStudy.Controllers.CustomerControllers.showInformationCustomers;
import static CaseStudy.Controllers.EmployeeController.findEmployeeFromResume;
import static CaseStudy.Controllers.EmployeeController.showInformationEmployee;
import static CaseStudy.Controllers.ServiceControllers.addNewServies;
import static CaseStudy.Controllers.ServiceControllers.processMenuShowService;

public class MainController {
    public static void processMain(){
        try{
            displayMainMenu();
            processMainMenu();
        }catch (Exception e){
            backMainMenu();
        }
    }



    public static void processMainMenu(){
        switch (ScannerUtils.scanner.nextInt()) {
            case 1: {
                addNewServies();
                break;
            }
            case 2: {
                showServices();
                break;
            }
            case 3: {
                addNewCustomer();
                break;
            }
            case 4: {
                showInformationCustomers();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showInformationEmployee();
                break;
            }
            case 7: {
                bookingMovieTicket4D();
                break;
            }
            case 8: {
                findEmployeeFromResume();
                break;
            }
            case 9: {
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Error!!! Enter to back Menu");
                ScannerUtils.scanner.nextLine();
                backMainMenu();
            }
        }
    }

    public static void backMainMenu() {
        displayMenuBackToMain();
        processMain();
    }

    public static void showServices() {
        displayMenuShowServices();
        processMenuShowService();
    }


}