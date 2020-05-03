package P7_CaseStudy.Controllers;

import P7_CaseStudy.Commons.FuncFileCustomerCSV;
import P7_CaseStudy.Commons.FunctionValidation;
import P7_CaseStudy.Models.Customer;
import P7_CaseStudy.Models.SortNameAndYear;

import java.util.ArrayList;
import java.util.Scanner;

import static P7_CaseStudy.Commons.FuncGeneric.displayList;
import static P7_CaseStudy.Controllers.MainController.displayMainMenu;

//"FullName,Birthday,Gender,IdCard,Phone,Email,Customer Type,Address"
public class CustomerController {
    public static Scanner scn = new Scanner(System.in);
    public static Customer customer = new Customer();
    public static ArrayList<Customer> listCustomer = new ArrayList<Customer>();

    public static void addNewCustomer() {
        listCustomer = FuncFileCustomerCSV.getfileCSVtoListCustomer();
        System.out.println("Full Name:");
        addFullName();
        System.out.println("Birthday:");
        addBirthday();
        System.out.println("Gender:");
        addGender();
        System.out.println("IdCard:");
        addId();
        System.out.println("Phone:");
        addPhone();
        System.out.println("Email:");
        addEmail();
        System.out.println("Customer Type:");
        addCustomerType();
        System.out.println("Address:");
        addAddress();
        listCustomer.add(customer);
        FuncFileCustomerCSV.writeCustomertoCSV(listCustomer);
        System.out.println("Add new Customer completed! Enter to continue...");
        scn.nextLine();
        displayMainMenu();
    }

    private static void addAddress() {
        String temp = scn.next();
        while (!FunctionValidation.checkCustomerAddress(temp)) {
            System.out.println("Address is invalid! Enter Address again:");
            temp = scn.next();
        }
        customer.setAddress(temp);
    }

    private static void addCustomerType() {
        String temp = scn.next();
        while (!FunctionValidation.checkCustomerType(temp)) {
            System.out.println("Customer Type is invalid! Enter Customer Type again:");
            temp = scn.next();
        }
        customer.setCustomerType(temp);
    }

    private static void addPhone() {
        String temp = scn.next();
        while (!FunctionValidation.checkCustomerPhone(temp)) {
            System.out.println("Phone Type is invalid! Enter Phone Type again:");
            temp = scn.next();
        }
        customer.setPhone(temp);
    }

    private static void addEmail() {
        String temp = scn.next();
        while (!FunctionValidation.checkCustomerEmail(temp)) {
            System.out.println("Email is invalid! Enter Email again:");
            temp = scn.next();
        }
        customer.setEmail(temp);
    }

    private static void addId() {
        String idTemp = scn.next();
        while (!FunctionValidation.checkCustomerId((idTemp))) {
            System.out.println("Id is invalid! Enter Id  again:");
            idTemp = scn.next();
        }
        customer.setIdCard(idTemp);
    }

    private static void addGender() {
        String temp = scn.next();
        while (!FunctionValidation.checkCustomerGender(temp)) {
            System.out.println("Gender is invalid! Enter Gender Type again:");
            temp = scn.next();
        }
        customer.setGender(temp);
    }

    private static void addBirthday() {
        String tempBirthday = scn.nextLine();
        while (!FunctionValidation.checkCustomerBirthday(tempBirthday)) {
            System.out.println("Birthday is invalid! Enter Birthday again:");
            tempBirthday = scn.nextLine();
        }
        customer.setBirthDay(tempBirthday);
    }

    private static void addFullName() {
        String tempFullName = scn.nextLine();
        while (!FunctionValidation.checkCustomerName(tempFullName)) {
            System.out.println("FullName is invalid! Enter FullName again:");
            tempFullName = scn.nextLine();
        }
        customer.setFullName(tempFullName);
    }

    public static void showInformationCustomer() {
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        listCustomer = FuncFileCustomerCSV.getfileCSVtoListCustomer();
        listCustomer.sort(new SortNameAndYear());
        displayList(listCustomer);
        System.out.println(("Enter to continue...."));
        scn.nextLine();
        displayMainMenu();
    }
}

